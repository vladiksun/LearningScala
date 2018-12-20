package chapter_21_implicit_conversions_and_parameters.implicits_4_converting_receiver

object ImplicitClasses extends App {

	case class Rectangle(width: Int, height: Int)

	implicit class RectangleMaker(width: Int) {
		def x(height: Int) = Rectangle(width, height)
	}

	val myRectangle = 3 x 4 // Magic !!!!!!!!
}
