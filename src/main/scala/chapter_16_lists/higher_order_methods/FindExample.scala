package chapter_16_lists.higher_order_methods

object FindExample extends App {

//	The find method is also similar to filter, but it returns the first element satisfying a given predicate,
//	rather than all such elements. The operation xs find p takes a list xs and a predicate p as operands. It
//	returns an optional value. If there is an element x in xs for which p(x) is true,Some(x) is returned.
//	Otherwise, p is false for all elements, and None is returned. Here are some examples:

	val findTestSome = List(1, 2, 3, 4, 5) find (_ % 2 == 0)
	println(findTestSome) // res43: Option[Int] = Some(2)

	val findTestNone = List(1, 2, 3, 4, 5) find (_ <= 0)
	println(findTestNone)  // res44: Option[Int] = None
}
