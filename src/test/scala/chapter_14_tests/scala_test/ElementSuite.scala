package chapter_14_tests.scala_test

import chapter_10_composition_and_inheritance.Element.elem
import org.scalatest.FunSuite

class ElementSuite extends FunSuite {

	test("elem result should have passed width") {
		val ele = elem('x', 2, 3)
		assert(ele.width == 2)
	}

	test("example of an assertResult") {
		assertResult(7) {
			val ele = elem('x', 2, 3)
			ele.width
		}
	}

	test("example test throws exception") {
		assertThrows[IllegalArgumentException] {
			elem('x', -2, 3)
		}
	}

	test("example test throws exception and intercept") {
		val caught =
			intercept[ArithmeticException] {
				1 / 0
			}
		assert(caught.getMessage == "/ by zero")
	}
}
