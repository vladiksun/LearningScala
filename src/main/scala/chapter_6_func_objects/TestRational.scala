package chapter_6_func_objects

object TestRational extends App {

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)

    println(oneHalf + twoThirds toString)

    println(oneHalf + 2 toString)

    println(oneHalf * 2 toString)

}
