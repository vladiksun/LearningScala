package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model._

object PatternGuardsExample extends App {

	val toSimplify = BinOp("+", Var("x"), Var("x"))

	val simplifiedResult = BinOp("*", Var("x"), Number(2))

//	This fails because Scala restricts patterns to be linear: a pattern variable may only appear once in a
//	pattern

//	def simplifyAddWrongWay(e: Expr) = e match {
//		case BinOp("+", x, x) => BinOp("*", x, Number(2))
//		case _ => e
//	}

//	However, you can re-formulate the match with a pattern guard
	def simplifyAdd(e: Expr) = e match {
		case BinOp("+", x, y) if x == y =>
			BinOp("*", x, Number(2))
		case _ => e
	}

	val expected = simplifyAdd(toSimplify)

	assert(expected == simplifiedResult)

}
