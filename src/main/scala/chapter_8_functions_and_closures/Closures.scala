package chapter_8_functions_and_closures

object Closures extends App {

    var more = 1

    val addMore = (x: Int) => x + more
    print(addMore(10))

    more = 2
    print(addMore(10))


    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    var sum = 0

    // closure inside foreach captures the reference to sum var
    someNumbers.foreach(sum += _)
    print(sum)

    // For example, here is a function that creates and returns increase closures:
    def makeIncreaser(more: Int) = (x: Int) => x + more

    val inc1 = makeIncreaser(1)
    val inc9999 = makeIncreaser(9999)


}
