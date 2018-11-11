package chapter_8_functions_and_closures

object PartiallyAppliedFunctions extends App {

    def sum(a: Int, b: Int, c: Int) = a + b + c

    val a = sum _

    print(a(1,2,3))


    val b = sum(1, _: Int, 3)

}
