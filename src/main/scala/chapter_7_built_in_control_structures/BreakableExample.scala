package chapter_7_built_in_control_structures

import scala.util.control.Breaks._

object BreakableExample {

	breakable {
		for (x <- 1 to 10) {
			if (Math.random < 0.1)
				break
		}
	}
}
