package chapter_16_lists.higher_order_methods

object TakeWhileExample extends App {

//	The operation xs takeWhile p takes the longest prefix of list xs such that every element in the prefix satisfies p

	val takeWhileTest = List(1, 2, 3, -4, 5) takeWhile (_ > 0)
	println(takeWhileTest) // res45: List[Int] = List(1, 2, 3)
}
