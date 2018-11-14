package chapter_11_scala_hierarchy

class Dollars(val amount: Int) extends AnyVal {
	override def toString() = "$" + amount
}
