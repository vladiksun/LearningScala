package chapter_10_composition_and_inheritance

object TestElem extends App {

	// compiler error here
	// val test = new LineElement("")

	println(Element.elem(Array("one", "two")).toString)

}
