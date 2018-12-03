package chapter_17_other_collections.initializing_collections

import scala.collection.immutable.TreeSet

object InitViaFactoryMethod extends App {

	List(1, 2, 3)

	Set('a', 'b', 'c')

	import scala.collection.mutable
	mutable.Map("hi" -> 2, "there" -> 5)

	Array(1.0, 2.0, 3.0)


	val stuff = mutable.Set(42)	// stuff: scala.collection.mutable.Set[Int] = Set(42)
//	stuff += "abracadabra"

	val stuffAny = mutable.Set[Any](42)
	stuffAny += "abracadabra"


	val colors = List("blue", "yellow", "red", "green")
	val treeSet = TreeSet[String]() ++ colors
}
