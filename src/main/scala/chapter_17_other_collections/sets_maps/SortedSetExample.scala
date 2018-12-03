package chapter_17_other_collections.sets_maps

object SortedSetExample extends App {

	import scala.collection.immutable.TreeSet

	val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)

	val cs = TreeSet('f', 'u', 'n')

	println(ts) // TreeSet(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

	println(cs) // TreeSet(f, n, u)
}
