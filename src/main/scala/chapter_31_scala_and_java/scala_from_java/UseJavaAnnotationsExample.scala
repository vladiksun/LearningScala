package chapter_31_scala_and_java.scala_from_java

object UseJavaAnnotationsExample extends App {

	for {
		method <- UseJavaAnnotation.getClass.getMethods
			if method.getName.startsWith("test")
			if method.getAnnotation(classOf[Ignore]) == null } {
		println("found a test method: " + method)
	}
}
