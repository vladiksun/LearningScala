package chapter_11_scala_hierarchy

object NothingExample extends App {

	def error(message: String): Nothing =
		throw new RuntimeException(message)

	def divide(x: Int, y: Int): Int =
		if (y != 0) x / y
		else error("can't divide by zero")

	divide(1, 0)

}
