package chapter_25_collections_architecture

import scala.collection.mutable.ArrayBuffer

object BuildersExample {

	val buf = new ArrayBuffer[Int]
	//	buf: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()


	val bldr = buf mapResult (_.toArray)
	//	bldr: scala.collection.mutable.Builder[Int,Array[Int]] = ArrayBuffer()

	Map("a" -> 1, "b" -> 2) map { case (x, y) => (y, x) }
	//	res3: scala.collection.immutable.Map[Int,java.lang.String] = Map(1 -> a, 2 -> b)

	Map("a" -> 1, "b" -> 2) map { case (x, y) => y }
	//	res4: scala.collection.immutable.Iterable[Int] = List(1, 2)
}
