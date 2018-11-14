package chapter_11_scala_hierarchy

class CustomValueClass(val amount: Int) extends AnyVal {

	override def toString(): String = "$" + amount
}
