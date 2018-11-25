package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model.{BinOp, Expr, Number}

object ConstructorPatternsExample extends App {

//    the pattern checks that the top-level object is a BinOp, that
//    its third constructor parameter is a Number, and that the value field of that number is 0. This pattern is
//    one line long yet checks three levels deep.
    def constructorMatch(expr: Expr) = expr match {
        case BinOp("+", e, Number(0)) => println("a deep match")
        case _ =>
    }

}
