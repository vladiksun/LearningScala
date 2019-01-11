package chapter_24_collections_in_depth

import scala.collection.immutable.{HashMap, LinearSeq, SortedSet}
import scala.collection.mutable

object Col_2_consistency extends App {

	val trav = Traversable(1, 2, 3)
	Iterable("x", "y", "z")
	Map("x" -> 24, "y" -> 25, "z" -> 26)
	Set("x", "y", "z")
	SortedSet("hello", "world")
	mutable.Buffer("x", "y", "z")
	val vectorByDefault = IndexedSeq(1.0, 2.0)
	LinearSeq("x", "y", "z")

	List(1, 2, 3)
	HashMap("x" -> 24, "y" -> 25, "z" -> 26)

}
