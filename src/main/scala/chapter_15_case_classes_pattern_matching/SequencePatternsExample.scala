package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model.{BinOp, Expr, Number}

object SequencePatternsExample extends App {

//    The pattern that checks for a three-element list starting with zero.
    def match3Elements(expr: Expr) = expr match {
        case List(0, _, _) => println("found it")
        case _ =>
    }


    def matchAnyLengthStartWithZero(expr: Expr) = expr match {
        case List(0, _*) => println("found it")
        case _ =>
    }
}
