package chapter_15_case_classes_pattern_matching

object TuplePatternsExample extends App {

	def tupleDemo(expr: Any) =
		expr match {
			case (a, b, c) => println("matched " + a + b + c)
			case _ =>
		}

	tupleDemo(("a ", 3, "-tuple"))
}
