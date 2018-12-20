package chapter_21_implicit_conversions_and_parameters.implicits_4_converting_receiver

object SimulatingNewSyntax extends App {

	Map(1 -> "one", 2 -> "two", 3 -> "three") // this is an Predef#ArrowAssoc usage

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	class MyArrowAssoc[A](x: A) {
		def ----> [B](y: B): Tuple2[A, B] = Tuple2(x, y)
	}

	implicit def any2ArrowAssoc[A](x: A): MyArrowAssoc[A] = new MyArrowAssoc(x)

	val m1 = Map(1 ----> "one", 2 ----> "two", 3 ----> "three") // this is an Predef#ArrowAssoc usage

	println(m1)
}
