package chapter_23_for_expressions_revisited

object ForExpr_2_Understand_2 extends App {

	val innerLoop = for (x <- List(1, 2); y <- List("one", "two"))
					yield (x, y)


	assert( innerLoop == List((1, "one"), (1, "two"), (2, "one"), (2, "two")))
}
