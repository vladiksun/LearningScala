package chapter_16_lists.processing

object ProcessingExample {

	(List(10, 20), List(3, 4, 5)).zipped.map(_ * _) // res63: List[Int] = List(30, 80)

	(List("abc", "de"), List(3, 2)).zipped.forall(_.length == _) 	// res64: Boolean = true

	(List("abc", "de"), List(3, 2)).zipped.exists(_.length != _)	// res65: Boolean = false
}
