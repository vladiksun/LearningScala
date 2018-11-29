package chapter_16_lists.higher_order_methods

object FoldingExample extends App {

//	Another common kind of operation combines the elements of a list with some operator. For instance:
//	sum(List(a, b, c)) equals 0 + a + b + c

	def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)

	println( sum(List(2,2,2)) )

	def product(xs: List[Int]): Int = (1 /: xs) (_ * _)

	println( product(List(2,2,2)) )

//	A fold left operation "(z /: xs) (op)" involves three objects: a start value z, a list xs, and a binary
//	operation op. The result of the fold is op applied between successive elements of the list prefixed by z.
//	For instance:
//			(z /: List(a, b, c)) (op) equals op(op(op(z, a), b), c)

//	Here's another example that illustrates how /: is used. To concatenate all words in a list of strings with
//	spaces between them and in front, you can write this:

	val words = List("the", "quick", "brown", "fox")

	// fold left
	println(    (words.head /: words.tail) (_ + " " + _)    )
	// fold right
	println(    (words.tail :\ words.head) (_ + " " + _)    )


	def flattenLeft[T](xss: List[List[T]]) =
		(List[T]() /: xss) (_ ::: _)

	def flattenRight[T](xss: List[List[T]]) =
		(xss :\ List[T]()) (_ ::: _)


	// Reverse example via folding
	// def reverseLeft[T](xs: List[T]) = (startvalue /: xs)(operation)

	def reverseLeft[T](xs: List[T]) =
		(List[T]() /: xs) {(ys, y) => y :: ys}
}
