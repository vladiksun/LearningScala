package chapter_16_lists.list_object_methods

object TabulateExample extends App {

	// The tabulate method creates a list whose elements are computed according to a supplied function

	val squares = List.tabulate(5)(n => n * n) // squares: List[Int] = List(0, 1, 4, 9, 16)

	val multiplication = List.tabulate(5,5)(_ * _)
//	multiplication: List[List[Int]] = List(List(0, 0, 0, 0, 0),
//		List(0, 1, 2, 3, 4), List(0, 2, 4, 6, 8),
//		List(0, 3, 6, 9, 12), List(0, 4, 8, 12, 16))
}
