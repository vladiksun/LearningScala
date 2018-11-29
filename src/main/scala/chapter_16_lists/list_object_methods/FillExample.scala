package chapter_16_lists.list_object_methods

object FillExample extends App {

	List.fill(5)('a')  		// res57: List[Char] = List(a, a, a, a, a)
	List.fill(3)("hello") 	// res58: List[String] = List(hello, hello, hello)

	// multi-dimensional lists
	List.fill(2, 3)('b') 	// res59: List[List[Char]] = List(List(b, b, b), List(b, b, b))
}
