package chapter_10_composition_and_inheritance

import chapter_10_composition_and_inheritance.Element.LineElement

object TestElement extends App {

	// compiler error here
	// val test = new LineElement("")

	println(Element.elem(Array("one", "two")).toString)

}
