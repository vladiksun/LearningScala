package chapter_7_built_in_control_structures

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

object ExceptionHandling extends App {

    val n = 4

    // in scala throw returns a value of Nothing which allows to do this
    val half =
        if (n % 2 == 0)
            n / 2
        else
            throw new RuntimeException("n must be even")


    val fileReader = new FileReader("input.txt") // Use and close file
    try {
        fileReader.read()
    } catch {
        case ex: FileNotFoundException => // Handle missing file
        case ex: IOException => // Handle other I/O error
    } finally {
        fileReader.close()
    }

    // try catch returns a value
    def urlFor(path: String) =
        try {
            new URL(path)
        } catch {
            case e: MalformedURLException => new URL("http://www.scala-lang.org")
        }


    // Do not return values from finally !!!!!!!!!!!!!!!!
    def f(): Int = try return 1 finally return 2 // calling f() results in 2

    def g(): Int = try 1 finally 2 // calling g() results in 1

}
