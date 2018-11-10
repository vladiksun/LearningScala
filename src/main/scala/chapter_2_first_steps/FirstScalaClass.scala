package chapter_2_first_steps

class FirstScalaClass {

    val firstVal: String = "First val"
    var firstVar = "First var"

    def firstFunction(x: Int, y: Int): Int = {
        if (x > y) x else y
    }

    def secondFunction(x: Int, y: Int): Int = if (x > y) x else y

    private def thirdFunction(x: Int, y: Int) = if (x > y) x else y
}
