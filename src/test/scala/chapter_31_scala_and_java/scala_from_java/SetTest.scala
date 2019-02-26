package chapter_31_scala_and_java.scala_from_java

import org.junit.Assert.assertEquals
import org.junit.Test

class SetTest {

	@Test
	def testMultiAdd = {
		val set = Set() + 1 + 2 + 3 + 1 + 2 + 3
		assertEquals(3, set.size)
	}
}
