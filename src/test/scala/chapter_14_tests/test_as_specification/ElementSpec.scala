package chapter_14_tests.test_as_specification

import org.scalatest.{FlatSpec, Matchers}
import chapter_10_composition_and_inheritance.Element.elem

class ElementSpec extends FlatSpec with Matchers {

	"A UniformElement" should
			"have a width equal to the passed value" in {
		val ele = elem('x', 2, 3)
		ele.width should be (2)
	}
}
