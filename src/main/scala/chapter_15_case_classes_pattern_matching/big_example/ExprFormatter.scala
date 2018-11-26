package chapter_15_case_classes_pattern_matching.big_example

import chapter_10_composition_and_inheritance._
import Element.elem
import chapter_15_case_classes_pattern_matching.model._

class ExprFormatter {

	// Contains operators in groups of increasing precedence
	private val opGroups =
		Array(
			Set("|", "||"),
			Set("&", "&&"),
			Set("^"),
			Set("==", "!="),
			Set("<", "<=", ">", ">="),
			Set("+", "-"),
			Set("*", "%")
		)

	// A mapping from operators to their precedence
	private val precedenceMap = {
		val assocs =
			for {
				i <- opGroups.indices
				op <- opGroups(i)
			} yield op -> i // this is actually an array of tuples pairs (op, i).
		assocs.toMap // array of tuples to a map conversion
	}

	private val unaryPrecedence = opGroups.length
	private val fractionPrecedence = -1

	private def format(e: Expr, enclPrec: Int): Element =
		e match {
			case Var(name) =>
				elem(name)
			case Number(num) =>
				def stripDot(s: String) =
					if (s endsWith ".0") s.substring(0, s.length - 2)
					else s
				elem(stripDot(num.toString))
			case UnOp(op, arg) =>
				elem(op) beside format(arg, unaryPrecedence)
			case BinOp("/", left, right) =>
				val top = format(left, fractionPrecedence)
				val bot = format(right, fractionPrecedence)
				val line = elem('-', top.width max bot.width, 1)
				val frac = top above line above bot
				if (enclPrec != fractionPrecedence) frac
				else elem(" ") beside frac beside elem(" ")
			case BinOp(op, left, right) =>
				val opPrec = precedenceMap(op)
				val l = format(left, opPrec)
				val r = format(right, opPrec + 1)
				val oper = l beside elem(" " + op + " ") beside r
				if (enclPrec <= opPrec) oper
				else elem("(") beside oper beside elem(")")
		}


	def format(e: Expr): Element =
		format(e, 0)
}
