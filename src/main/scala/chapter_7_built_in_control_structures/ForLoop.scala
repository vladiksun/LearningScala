package chapter_7_built_in_control_structures

object ForLoop extends App {

    val filesHere = new java.io.File(".").listFiles

    for (file <- filesHere)
        println(file)


    for (i <- 1 to 4)
        println("Iteration " + i)


    for (i <- 1 until 4)
        println("Iteration " + i)


    for (file <- filesHere if file.getName.endsWith(".scala"))
        println(file)

    for ( file <- filesHere
          if file.isFile
          if file.getName.endsWith(".scala") )
        println(file)
}
