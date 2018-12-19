package chapter_21_implicit_conversions_and_parameters.implicits_1_rules

object MyConversions {
	implicit def intToString(x: Int) = {
		println("Conversion from int to String happened")
		x.toString
	}
}
