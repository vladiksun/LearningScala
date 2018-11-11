package chapter_8_functions_and_closures

object TailRecursion extends App {

    def isGoodEnough(guess: Double): Boolean = true

    def improve(guess: Double): Double = 2

    def approximate(guess: Double): Double =
        if (isGoodEnough(guess)) guess
        else approximate(improve(guess)) // recursive tail will be optimized by compiler

    // Imperative way
    // The compiled code for approximate is essentially the same as the compiled code for approximateLoop.
    def approximateLoop(initialGuess: Double): Double = {
        var guess = initialGuess
        while (!isGoodEnough(guess))
            guess = improve(guess)
        guess
    }


 /*   A tail-recursive function will not build a new stack frame for each call; all calls will execute in a single
    frame. This may surprise a programmer inspecting a stack trace of a program that failed. For example,
    this function calls itself some number of times then throws an exception:*/

    def boom(x: Int): Int =
        if (x == 0) throw new Exception("boom!")
        else boom(x - 1)

}
