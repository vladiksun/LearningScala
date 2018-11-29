package chapter_16_lists.first_order_methods

object Converting extends App {

	val abcde = List('a', 'b', 'c', 'd', 'e')

	val arr = abcde.toArray // arr: Array[Char] = Array(a, b, c, d, e)
	arr.toList // res26: List[Char] = List(a, b, c, d, e)

	val arr2 = new Array[Int](10) // arr2: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

	List(1, 2, 3) copyToArray (arr2, 3)
	arr2 //  res28: Array[Int] = Array(0, 0, 0, 1, 2, 3, 0, 0, 0, 0)


	val it = abcde.iterator  // it: Iterator[Char] = non-empty iterator
	it.next // res29: Char = a
}
