package chapter_5_basic_types_and_operations

object Strings extends App {

    println("""Welcome to Ultamix 3000.
           Type "HELP" for help.""")

    println("""|Welcome to Ultamix 3000.
               |Type "HELP" for help.""".stripMargin)


    val name = "reader"
    println(s"Hello, $name!")

    val s = s"The answer is ${6 * 7}."

    val f = f"${math.Pi}%.5f"

    val raw = raw"No\\\\escape!"
}


