package chapter_16_lists

object ListType {

	val fruit: List[String] = List("apples", "oranges", "pears")
	val nums: List[Int] = List(1, 2, 3, 4)
	val diag3: List[List[Int]] =
		List(
			List(1, 0, 0),
			List(0, 1, 0),
			List(0, 0, 1)
		)
	val empty: List[Nothing] = List()

	// List() is also of type List[String]!
	val xs: List[String] = List()
}
