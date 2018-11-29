package chapter_16_lists.list_object_methods

object ConcatExample extends App {

	List.concat(List('a', 'b'), List('c')) 		// res60: List[Char] = List(a, b, c)

	List.concat(List(), List('b'), List('c'))	// res61: List[Char] = List(b, c)

	List.concat() // res62: List[Nothing] = List()
}
