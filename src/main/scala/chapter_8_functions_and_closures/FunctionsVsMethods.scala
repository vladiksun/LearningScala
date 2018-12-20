package chapter_8_functions_and_closures

//	http://jim-mcbeath.blogspot.com/2009/05/scala-functions-vs-methods.html
object FunctionsVsMethods extends App {

	def m1(x:Int): Int = x + 3

	val f1 = (x: Int) => x + 3 // function object

	val f2 = m1 _  // The m1 _ syntax tells Scala to treat m1 as a function rather than taking the value generated by a call to that method

	val f2_1 : (Int) => Int = m1  //  Alternatively, you can explicitly declare the type of f2, in which case you don't need to include the trailing underscore:

	println( m1(2) )
	println( f1(2) )
	println( f2(2) )

	println( f1.toString )

	val f1_and_f2 = f1 andThen f2
	println( f1_and_f2(2) )

	val f3 = m1 _
	assert(f3 != f2) // different objects
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	// only methods can be type-parameterized, but an anonymous function can not
	def m2[T](x: T) = x.toString.substring(0,4)

//	However, if you are willing to define an explicit class for your function, then you can type-parameterize it similarly:
	class myfunc[T] extends Function1[T, String] {
	     def apply(x: T): String = x.toString.substring(0,4)
	}

	val f5 = new myfunc[String]
	println( f5("abcdefg") )
}