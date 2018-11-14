package chapter_30_scala_equality

object UserDefinedEquality extends App {

	def isEqual(x: Int, y: Int) = x == y
	println(isEqual(421, 421))


	def isEqual(x: Any, y: Any) = x == y
	println(isEqual(222, 222))

	val x = "abcd".substring(2)
	val y = "abcd".substring(2)
	println(x == y)
}
