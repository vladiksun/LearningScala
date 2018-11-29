package chapter_16_lists.first_order_methods

object MergeSortExample extends App {

	def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {

		def merge(xs: List[T], ys: List[T]): List[T] =
			(xs, ys) match {
				case (Nil, _) => ys
				case (_, Nil) => xs
				case (x :: xsRest, y :: ysRest) => // extract variables via pattern
					if (less(x, y)) x :: merge(xsRest, ys)
					else y :: merge(xs, ysRest)
			}

		val n = xs.length / 2
		if (n == 0) xs
		else {
			val (ys, zs) = xs splitAt n
			merge(msort(less)(ys), msort(less)(zs))
		}
	}

	msort((x: Int, y: Int) => x < y)(List(5, 7, 1, 3))

//	The msort function is a classical example of the currying concept discussed in Section 9.3.
//	Currying makes it easy to specialize the function for particular comparison functions. Here's an
//	example:
//	an underscore stands for a missing argument list
	val intSort = msort((x: Int, y: Int) => x < y)_  // intSort: List[Int] => List[Int] = <function1>
	intSort(List(5, 7, 1, 3)).foreach(print)

	println()

	val reverseIntSort = msort((x: Int, y: Int) => x > y)_
	reverseIntSort(List(5, 7, 1, 3)).foreach(print)

	// show type explicitly
	val msortTyped = msort[Int](_ > _)_


	// change currying order
	def msortSwapped[T](xs: List[T])(less: (T, T) => Boolean): List[T] = {
		msort(less)(xs)
	}

//  Now type inferencer does not want to see explicit type declaration
//	What has happened is that the inferencer used the known type of the first parameter List(5, 7, 1, 3) to determine
//	the type parameter of msortSwapped.
	msortSwapped(List(5, 7, 1, 3))(_ > _)

}
