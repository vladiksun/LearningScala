package chapter_14_tests.scala_check

import chapter_10_composition_and_inheritance.Element.elem
import org.scalatest.WordSpec
import org.scalatest.prop.PropertyChecks
import org.scalatest.MustMatchers._

//https://www.scalacheck.org/
class ElementSpec extends WordSpec with PropertyChecks {

	"elem result" must {
		"have passed width" in {
			forAll { (w: Int) =>
				whenever (w > 0) {
					elem('x', w, 3).width must equal (w)
				}
			}
		}
	}
}
