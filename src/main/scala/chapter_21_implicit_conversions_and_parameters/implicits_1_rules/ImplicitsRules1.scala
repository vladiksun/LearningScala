package chapter_21_implicit_conversions_and_parameters.implicits_1_rules

object ImplicitsRules1 extends App {

	def takeString(str:String) = println("String taken:" + str)

//			1 	Marking rule: Only definitions marked implicit are available.
//		 	2 	Scope rule: An inserted implicit conversion must be in scope as a single identifier, or be
//				associated with the source or target type of the conversion.
	implicit def intToString(x: Int) = {
		println("Conversion from int to String happened")
		x.toString
	}

	takeString(4) // conversion goes here
}

