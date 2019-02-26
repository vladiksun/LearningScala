package chapter_31_scala_and_java.scala_from_java

object UseJavaAnnotation {

	// java reflection will see this annotation
	@Ignore
	def testData = List(0, 1, -1, 5, -5)

	// java reflection will see this annotation
	@Ignore
	def test1 = {
		assert(testData == (testData.head :: testData.tail))
	}

	def test2 = {
		assert(testData.contains(testData.head))
	}
}
