package chapter_21_implicit_conversions_and_parameters.implicits_3_conversion_to_expected_type

object ToExpectedTypeExample extends App {

	implicit def doubleToInt(x: Double) = x.toInt

//	For example, normally a double cannot be used as an integer because it loses
//	precision
	val i: Int = 3.5


//	Behind the scenes, the code becomes
	val j: Int = doubleToInt(3.5)
}
