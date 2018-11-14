package chapter_30_scala_equality

object ReferenceEquality extends App {

	val x = new String("abc")
	val y = new String("abc")

	println(x == y)

	println(x eq y)

	println(x ne y)

}
