package chapter_8_functions_and_closures

import scala.io.{BufferedSource, Source}

object LocalFunctions {

    def processFile(filename: String, width: Int): Unit = {

        def processLine(filename: String, width: Int, line: String): Unit = {
            if (line.length > width)
                println(filename + ": " + line.trim)
        }

        val source: BufferedSource = Source.fromFile(filename)
        for (line <- source.getLines()) {
            processLine(filename, width, line)
        }
    }

    def processFile2(filename: String, width: Int) = {

        def processLine(line: String) = {
            if (line.length > width)
                println(filename + ": " + line.trim)
        }

        val source = Source.fromFile(filename)
        for (line <- source.getLines())
            processLine(line)
    }
}
