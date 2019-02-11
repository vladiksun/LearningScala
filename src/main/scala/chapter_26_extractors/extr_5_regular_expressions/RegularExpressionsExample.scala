package chapter_26_extractors.extr_5_regular_expressions

import chapter_26_extractors.extr_5_regular_expressions.RegularExpressionsExample.decimalPattern3

import scala.util.matching.Regex

object RegularExpressionsExample extends App {

	val decimalPattern1 = new Regex("(-)?(\\d+)(\\.\\d*)?")

	val decimalPattern2 = new Regex("""(-)?(\d+)(\.\d*)?""")

	val decimalPattern3 = """(-)?(\d+)(\.\d*)?""".r

	val input = "for -1.0 to 99 by 3"

	for (s <- decimalPattern3 findAllIn input)
		println(s)

	decimalPattern3 findFirstIn input	//	res7: Option[String] = Some(-1.0)

	decimalPattern3 findPrefixOf input 	//	res8: Option[String] = None

	//	extract groups
	val decimalPattern3(sign, integerpart, decimalpart) = "-1.23"
	//	sign: String = -
	//	integerpart: String = 1
	//	decimalpart: String = .23


	// decomposing
	for (decimalPattern3(s, i, d) <- decimalPattern3 findAllIn input)
		println("sign: " + s + ", integer: " + i + ", decimal: " + d)
}
