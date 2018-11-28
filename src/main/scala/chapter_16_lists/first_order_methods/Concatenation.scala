package chapter_16_lists.first_order_methods

object Concatenation extends App {

	val concat1 = List(1, 2) ::: List(3, 4, 5)
	assert(concat1 == List(1,2,3,4,5))

	val concat2 = List() ::: List(1, 2, 3)
	assert(concat2 == List(1, 2, 3))

	def customAppend[T](xs: List[T], ys: List[T]): List[T] =
		xs match {
			case List() => ys
			case x :: xs1 => x :: customAppend(xs1, ys) // 'x' is a head pattern, 'xs1' is a tail pattern
		}
}
