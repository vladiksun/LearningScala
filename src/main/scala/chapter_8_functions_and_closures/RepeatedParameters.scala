package chapter_8_functions_and_closures

object RepeatedParameters extends App {

    def echo(args: String*) =
        for (arg <- args) println(arg)

    echo()
    echo("one")
    echo("hello", "world!")


    val arr = Array("What's", "up", "doc?")

    echo(arr: _*)
}
