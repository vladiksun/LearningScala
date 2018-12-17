package chapter_20_abstract_members.abstract_10_case_study

object Europe extends CurrencyZone {

	abstract class Euro extends AbstractCurrency {
		def designation = "EUR"
	}

	type Currency = Euro

	def make(cents: Long) = new Euro {
		val amount = cents
	}

	val Cent = make(1)
	val Euro = make(100)
	val CurrencyUnit = Euro
}
