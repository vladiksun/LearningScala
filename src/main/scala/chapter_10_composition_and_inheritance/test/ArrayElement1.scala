package chapter_10_composition_and_inheritance.test

class ArrayElement1(conts: Array[String]) extends TestElement {

	override def contents: Array[String] = conts
}
