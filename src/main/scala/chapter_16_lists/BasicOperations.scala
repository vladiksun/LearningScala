package chapter_16_lists

object BasicOperations {

//	Lists are very efficient when the algorithm processing them is careful to only process their heads.
//	Accessing, adding, and removing the head of a list takes only constant time, whereas accessing or
//	modifying elements later in the list takes time linear in the depth into the list.

	def isort(xs: List[Int]): List[Int] =
		if (xs.isEmpty) Nil
		else insert(xs.head, isort(xs.tail))

	def insert(x: Int, xs: List[Int]): List[Int] =
		if (xs.isEmpty || x <= xs.head) x :: xs
		else xs.head :: insert(x, xs.tail)
}
