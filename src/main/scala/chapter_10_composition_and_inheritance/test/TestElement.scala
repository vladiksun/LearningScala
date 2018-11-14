package chapter_10_composition_and_inheritance.test

abstract class TestElement {

	val testVal = false

    def contents: Array[String]

    def  height: Int = contents.length

	def width: Int =
		if (height == 0)
			0
		else
			contents(0).length

}
