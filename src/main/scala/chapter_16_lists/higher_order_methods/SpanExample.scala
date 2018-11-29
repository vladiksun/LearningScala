package chapter_16_lists.higher_order_methods

object SpanExample extends App {

//	The span method combines takeWhile and dropWhile in one operation, just
//	like splitAt combines take and drop. It returns a pair of two lists, defined by the equality:
//	xs span p equals (xs takeWhile p, xs dropWhile p)

	val spanTest = List(1, 2, 3, -4, 5) span (_ > 0)
	println(spanTest) // res47: (List[Int], List[Int]) = (List(1, 2, 3),List(-4, 5))
}
