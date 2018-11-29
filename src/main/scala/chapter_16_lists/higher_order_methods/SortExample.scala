package chapter_16_lists.higher_order_methods

object SortExample extends App {

	val sorted = List(1, -3, 4, 2, 6) sortWith (_ < _)
	println(sorted)

	val words = List("the", "quick", "brown", "fox")
	val sortedStrings = words sortWith (_.length > _.length)
	println(sortedStrings)
}
