package chapter_7_built_in_control_structures

object IfExample extends App {

    val filename =
        if (!args.isEmpty)
            args(0)
        else
            "default.txt"

    println(if (!args.isEmpty) args(0) else "default.txt")
}
