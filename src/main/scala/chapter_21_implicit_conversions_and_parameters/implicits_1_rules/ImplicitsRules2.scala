package chapter_21_implicit_conversions_and_parameters.implicits_1_rules

object ImplicitsRules2 extends App {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	class Dollar {}
	object Dollar {

		//		 2 	Scope rule: An inserted implicit conversion must be in scope as a single identifier, or be
		//			associated with the source or target type of the conversion.
		implicit def dollarToEuro(x: Dollar): Euro = {
			println("Converting to euro")
			new Euro()
		}
	}

	class Euro() {}

	def takeEuro(euro: Euro) = println("Taken euro")

	val dollarToEuro = new Dollar
	takeEuro(dollarToEuro) // conversion goes here
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
