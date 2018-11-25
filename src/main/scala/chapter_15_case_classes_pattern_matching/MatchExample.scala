package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model._

object MatchExample extends App {

    def simplifyTop(expr: Expr): Expr = expr match {
        case UnOp("-", UnOp("-", e)) => e // Double negation
        case BinOp("+", e, Number(0)) => e // Adding zero
        case BinOp("*", e, Number(1)) => e // Multiplying by one
        case _ => expr
    }

    simplifyTop(UnOp("-", UnOp("-", Var("x"))))

    def default(expr: Expr) = expr match {
        case BinOp(op, left, right) =>
            println(expr + " is a binary operation")
        case _ => println("default")// handle the default case
    }

    //    Wildcards can also be used to ignore parts of an object that you do not care about.
    def ignoreExpressionFieldsInPattern(expr: Expr) = expr match {
        case BinOp(_, _, _) => println(expr + " is a binary operation")
        case _ => println("It's something else")
    }

}
