package chapter_8_functions_and_closures

object FirstClassFunctions {

    var increase = (x: Int) => x + 1

    increase = (x: Int) => x + 9999

    increase = (x: Int) => {
        println("We")
        println("are")
        println("here!")
        x + 1
    }

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => println(x))
    someNumbers.foreach(x => println(x))
    someNumbers.foreach(println _)
    someNumbers.foreach(println)

    someNumbers.filter((x: Int) => x > 0)
    someNumbers.filter((x) => x > 0)
    someNumbers.filter(x => x > 0)
    someNumbers.filter(_ > 0)
}
