package chapter_11_scala_hierarchy

class SwissFrancs(val amount: Int) extends AnyVal {
	override def toString() = amount + " CHF"
}
