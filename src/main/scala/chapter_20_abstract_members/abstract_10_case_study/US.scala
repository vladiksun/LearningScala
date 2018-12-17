package chapter_20_abstract_members.abstract_10_case_study

object US extends CurrencyZone {

	abstract class Dollar extends AbstractCurrency {
		def designation = "USD"
	}

	override type Currency = Dollar

	val Cent: Currency = make(1)
	val Dollar: Currency = make(100)
	val CurrencyUnit: Currency = Dollar

	override def make(cents: Long): Dollar = new Dollar {
		override val amount: Long = cents
	}


}
