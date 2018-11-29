package chapter_16_lists.first_order_methods

object mkString extends App {

	val abcde = List('a', 'b', 'c', 'd', 'e')

	println( abcde mkString ("[", ",", "]") ) // [a,b,c,d,e]

	println( abcde mkString "" ) // abcde

	println( abcde mkString )  // abcde

	println( abcde mkString ("List(", ", ", ")") ) // List(a, b, c, d, e)


	val buf = new StringBuilder
	println(	abcde addString (buf, "(", ";", ")")	)  // res25: StringBuilder = (a;b;c;d;e)
}
