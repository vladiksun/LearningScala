package chapter_21_implicit_conversions_and_parameters.implicits_4_converting_receiver

import chapter_6_func_objects.Rational

object InteroperatingWithNewTypes extends App {

	val oneHalf = new Rational(1, 2)

	oneHalf + oneHalf

	oneHalf + 1

	implicit def intToRational(x: Int) = new Rational(x, 1)

//	This expression is tricky because the receiver, 1, does not
//	have a suitable + method
//	To allow this kind of mixed arithmetic, you need to define an implicit conversion from Int toRational
	1 + oneHalf



}
