package chapter_16_lists.first_order_methods

object Reverse {

//	If at some point in the computation an algorithm demands frequent accesses to the end of a list, it's
//	sometimes better to reverse the list first and work with the result instead. Here's how to do the reversal:

	val abcde = List('a', 'b', 'c', 'd', 'e')

	abcde.reverse // res6: List[Char] = List(e, d, c, b, a)

	def verySlowCustomReverse[T](xs: List[T]): List[T] = xs match {
		case List() => xs
		case x :: xs1 => verySlowCustomReverse(xs1) ::: List(x)
	}
}
