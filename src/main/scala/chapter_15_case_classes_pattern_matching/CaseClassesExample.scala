package chapter_15_case_classes_pattern_matching

object CaseClassesExample extends App {

	abstract class Expr
	case class Var(name: String) extends Expr
	case class Number(num: Double) extends Expr
	case class UnOp(operator: String, arg: Expr) extends Expr
	case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

}
