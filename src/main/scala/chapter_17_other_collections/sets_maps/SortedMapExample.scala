package chapter_17_other_collections.sets_maps

object SortedMapExample extends App {

	import scala.collection.immutable.TreeMap

	var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')

	tm += (2 -> 'x')

	println(tm) // Map(1 -> x, 2 -> x, 3 -> x, 4 -> x)
}
