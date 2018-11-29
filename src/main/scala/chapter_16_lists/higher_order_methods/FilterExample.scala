package chapter_16_lists.higher_order_methods

object FilterExample extends App {

//	The operation "xs filter p" takes as operands a list xs of type List[T] and a predicate function pof
//	type T => Boolean. It yields the list of all elements x in xs for which p(x) is true. For instance:

	val filtered = List(1, 2, 3, 4, 5) filter (_ % 2 == 0)
	println(filtered)  // res40: List[Int] = List(2, 4)

	val words = List("the", "quick", "brown", "fox")

	val filtered2 = words filter (_.length == 3)
	println(filtered2) // res41: List[String] = List(the, fox)
}
