package chapter_10_composition_and_inheritance.test

// In Scala you can override from constructor
class ArrayElement5(val contents: Array[String],
					private val privateVal: String) extends TestElement {
	
}
