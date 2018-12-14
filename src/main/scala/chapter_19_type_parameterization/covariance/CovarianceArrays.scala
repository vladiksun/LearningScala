package chapter_19_type_parameterization.covariance

object CovarianceArrays extends App {

	// Not allowed by covariance
	//	val c1 = new Cell[String]("abc")
	//	val c2: Cell[Any] = c1
	//	c2.set(1)
	//	val s: String = c1.get


	// Covariance of arrays is possible in java. This is Java
	//	String[] a1 = { "abc" };
	//	Object[] a2 = a1;
	//	a2[0] = new Integer(17);
	//	String s = a1[0];

	// But Covariance of arrays not possible in Scala
	val a1: Array[String] = Array("abc")
	//val a2: Array[AnyRef] = a1  // compile time error
	//a2(0) = new Integer(17)

	// But we can cast to support java libs calls
	val a2: Array[Object] = a1.asInstanceOf[Array[Object]]

	//	The cast is always legal at compile-time, and it will always succeed at run-time because the JVM's
	//	underlying run-time model treats arrays as covariant, just as Java the language does. But you might
	//	get ArrayStore exceptions afterwards, again just as you would in Java.
}
