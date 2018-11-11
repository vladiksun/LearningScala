package chapter_8_functions_and_closures

object NamedArguments extends App {

    def speed(distance: Float, time: Float): Float =
        distance / time

    speed(distance = 100, time = 10)

    speed(time = 10, distance = 100)
}
