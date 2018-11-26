package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model._

object UseSealedClasses extends App {

	// compiler issues a warning
	def describe(e: Expr): String = e match {
		case Number(_) => "a number"
		case Var(_) => "a variable"
	}


	def describe2(e: Expr): String = e match {
		case Number(_) => "a number"
		case Var(_) => "a variable"
		case _ => throw new RuntimeException // Should not happen
	}

	def describe3(e: Expr): String = (e: @unchecked) match {
		case Number(_) => "a number"
		case Var(_) => "a variable"
	}
}
