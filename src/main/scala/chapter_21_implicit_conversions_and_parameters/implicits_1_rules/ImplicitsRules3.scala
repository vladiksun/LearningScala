package chapter_21_implicit_conversions_and_parameters.implicits_1_rules

//	Naming an implicit conversion
import MyConversions._

object ImplicitsRules3 extends App {

	def takeString(str:String) = println("String taken:" + str)

	takeString(4) // conversion goes here
}
