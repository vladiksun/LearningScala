package chapter_2_first_steps

object FirstScript extends App {

    val firstVal: String = "First val"
    var firstVar = "First var"

    def firstFunction(x: Int, y: Int): Int = {
        if (x > y) x else y
    }

    def secondFunction(x: Int, y: Int): Int = if (x > y) x else y

    def thirdFunction(x: Int, y: Int) = if (x > y) x else y

    println(firstVal)
    println(firstVar)

    // Say hello to the first argument
    println("Hello, " + args(0) + "!")
}




