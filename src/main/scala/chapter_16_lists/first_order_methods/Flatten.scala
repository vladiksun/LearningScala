package chapter_16_lists.first_order_methods

object Flatten extends App {

	val flattend1 = List(List(1, 2), List(3), List(), List(4, 5)).flatten  // res14: List[Int] = List(1, 2, 3, 4, 5)
	println(flattend1)

	val fruits = List("apples", "oranges", "pears")
	val flattend2 = fruits.map(_.toCharArray).flatten
	println(flattend2)

	val flattend3 = fruits.flatMap(_.toCharArray)
	println(flattend3)
}
