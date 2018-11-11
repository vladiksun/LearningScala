package chapter_7_built_in_control_structures

object ForLoopNested extends App {

    val filesHere = new java.io.File(".").listFiles

    def fileLines(file: java.io.File) =
        scala.io.Source.fromFile(file).getLines().toList

    def grep(pattern: String): Unit =
        for ( file <- filesHere if file.getName.endsWith(".scala");
                line <- fileLines(file) if line.trim.matches(pattern) )
            println(file + ": " + line.trim)

    // Mid-stream variable bindings
    def grep2(pattern: String): Unit =
        for {
            file <- filesHere if file.getName.endsWith(".scala")
                line <- fileLines(file)
                trimmed = line.trim if trimmed.matches(pattern)
        }
            println(file + ": " + trimmed)

    grep(".*gcd.*")
}
