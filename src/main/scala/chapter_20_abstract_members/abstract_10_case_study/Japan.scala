package chapter_20_abstract_members.abstract_10_case_study

object Japan extends CurrencyZone{

	abstract class Yen extends AbstractCurrency {
		def designation = "JPY"
	}

	type Currency = Yen

	def make(yen: Long) = new Yen {
		val amount = yen
	}

	val Yen = make(1)
	val CurrencyUnit = Yen
}
