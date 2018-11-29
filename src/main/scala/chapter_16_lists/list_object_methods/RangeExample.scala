package chapter_16_lists.list_object_methods

object RangeExample extends App {

	List.range(1, 5)		// res54: List[Int] = List(1, 2, 3, 4)
	List.range(1, 9, 2)		// res55: List[Int] = List(1, 3, 5, 7)
	List.range(9, 1, -3)	// res56: List[Int] = List(9, 6, 3)
}
