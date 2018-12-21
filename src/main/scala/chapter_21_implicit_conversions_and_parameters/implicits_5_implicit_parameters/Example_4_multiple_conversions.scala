package chapter_21_implicit_conversions_and_parameters.implicits_5_implicit_parameters

object Example_4_multiple_conversions extends App {

	def printLength(seq: Seq[Int]) = println(seq.length)


	//	a conversion that turns an integer into a range
	implicit def intToRange(i: Int) = 1 to i

	//	a conversion that turns an integer into a list of digits
	implicit def intToDigits(i: Int) = i.toString.toList.map(_.toInt)

	//	Note that implicit conversions are not applicable because they are ambiguous
	//	printLength(12)

}
