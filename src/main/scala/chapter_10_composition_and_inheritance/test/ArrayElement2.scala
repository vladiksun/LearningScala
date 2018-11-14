package chapter_10_composition_and_inheritance.test

class ArrayElement2(x123: Array[String]) extends TestElement {

	// In Scala the field can override the method
	val contents: Array[String] = x123
	//override def contents: Array[String] = conts


}
