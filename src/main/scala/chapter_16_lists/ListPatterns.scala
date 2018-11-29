package chapter_16_lists

object ListPatterns extends App {

	val fruit: List[String] = List("apples", "oranges", "pears")

	// extract variables via pattern
	val List(a, b, c) = fruit

	assert(a == "apples")
	assert(b == "oranges")
	assert(c == "pears")

	// extract variables via pattern
	val d :: e :: rest = fruit
	assert(d == "apples")
	assert(e == "oranges")
	assert(rest == List("pears"))

	def isort(xs: List[Int]): List[Int] = xs match {
		case List() => List()
		case x :: xs1 => insert(x, isort(xs1))
	}
	def insert(x: Int, xs: List[Int]): List[Int] = xs match {
		case List() => List(x)
		case y :: ys => if (x <= y) x :: xs
		else y :: insert(x, ys)
	}
}
