package chapter_25_collections_architecture.RNA

import scala.collection.generic.CanBuildFrom
import scala.collection.{IndexedSeqLike, mutable}
import scala.collection.mutable.ArrayBuffer


final class RNA private (val groups: Array[Int], val length: Int)
		extends IndexedSeq[Base] with IndexedSeqLike[Base, RNA] {
	import RNA._
	// Mandatory re-implementation of `newBuilder` in `IndexedSeq`
	override protected[this] def newBuilder: mutable.Builder[Base, RNA] = RNA.newBuilder
	// Mandatory implementation of `apply` in `IndexedSeq`
	def apply(idx: Int): Base = {
		if (idx < 0 || length <= idx)
			throw new IndexOutOfBoundsException
		Base.fromInt(groups(idx / N) >> (idx % N * S) & M)
	}
	// Optional re-implementation of foreach,
	// to make it more efficient.
	override def foreach[U](f: Base => U): Unit = {
		var i = 0
		var b = 0
		while (i < length) {
			b = if (i % N == 0) groups(i / N) else b >>> S
			f(Base.fromInt(b & M))
			i += 1
		}
	}
}

object RNA {
	private val S = 2 // number of bits in group
	private val M = (1 << S) - 1 // bitmask to isolate a group
	private val N = 32 / S // number of groups in an Int

	def fromSeq(buf: Seq[Base]): RNA = {
		val groups = new Array[Int]((buf.length + N - 1) / N)
		for (i <- 0 until buf.length)
			groups(i / N) |= Base.toInt(buf(i)) << (i % N * S)
		new RNA(groups, buf.length)
	}
	def apply(bases: Base*) = fromSeq(bases)

	def newBuilder: mutable.Builder[Base, RNA] =
		new ArrayBuffer mapResult fromSeq

	implicit def canBuildFrom: CanBuildFrom[RNA, Base, RNA] =
		new CanBuildFrom[RNA, Base, RNA] {
			def apply(): mutable.Builder[Base, RNA] = newBuilder
			def apply(from: RNA): mutable.Builder[Base, RNA] = newBuilder
		}
}