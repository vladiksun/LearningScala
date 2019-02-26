package chapter_31_scala_and_java.wildcards

object TryJavaWildCards extends App {

	val contents = (new JavaWild).contents()

	println( contents )
	//	contents: java.util.Collection[_] = [a, b, see]


	import scala.collection.mutable
	val iter = (new JavaWild).contents.iterator
//	val set = mutable.Set.empty[???] // what type goes here?
//	while (iter.hasMore)
//		set += iter.next()


	import scala.collection.mutable
	import java.util.Collection

	abstract class SetAndType {
		type Elem
		val set: mutable.Set[Elem]
	}

	def javaSet2ScalaSet[T](jset: Collection[T]): SetAndType = {
		val sset = mutable.Set.empty[T] // now T can be named!
		val iter = jset.iterator
		while (iter.hasNext)
			sset += iter.next()
		return new SetAndType {
			type Elem = T
			val set = sset
		}
	}
}
