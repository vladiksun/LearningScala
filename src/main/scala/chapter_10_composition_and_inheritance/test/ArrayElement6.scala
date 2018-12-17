package chapter_10_composition_and_inheritance.test

// In Scala you can override from constructor
class ArrayElement6(val contents: Array[String],
					override val testVal: Boolean) extends TestElement {
	
}
