package chapter_17_other_collections.initializing_collections

import scala.collection.immutable.TreeSet

object Converting extends App {

//	Converting to array or list
	val colors = List("blue", "yellow", "red", "green")
	val treeSet = TreeSet[String]() ++ colors

	treeSet.toList 		// res50: List[String] = List(blue, green, red, yellow)
	treeSet.toArray		// res51: Array[String] = Array(blue, green, red, yellow)


//	Converting between mutable and immutable sets and maps
	import scala.collection.mutable
	val mutaSet = mutable.Set.empty ++= treeSet
	val immutaSet = Set.empty ++ mutaSet

	val muta = mutable.Map("i" -> 1, "ii" -> 2)
	val immu = Map.empty ++ muta
}
