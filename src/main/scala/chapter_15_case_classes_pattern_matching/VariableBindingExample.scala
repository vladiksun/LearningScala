package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model._

object VariableBindingExample extends App {

	def testVarBinding(expr: Expr) = expr match {
		case UnOp("abs", e @ UnOp("abs", _)) => e
		case _ =>
	}

}
