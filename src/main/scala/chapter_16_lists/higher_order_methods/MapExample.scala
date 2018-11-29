package chapter_16_lists.higher_order_methods

object MapExample extends App {

	val testMapList = List(1, 2, 3) map (_ + 1)
	println(testMapList) // res32: List[Int] = List(2, 3, 4)

	val words = List("the", "quick", "brown", "fox")
	val testMapList2 = words map(_.length)
	println(testMapList2)

	val testMapList3 = words map (_.toList.reverse.mkString)
	println(testMapList3)


	val mapped = words map (_.toList)
	println("mapped: " + mapped)
}
