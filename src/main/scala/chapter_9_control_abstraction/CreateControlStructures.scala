package chapter_9_control_abstraction

import java.io.{File, PrintWriter}

object CreateControlStructures extends App {


    def twice(op: Double => Double, x: Double) = op(op(x))

    twice((param: Double) => param + 1, 5)
    twice(param => param + 1, 5)
    twice(_ + 1, 5)



    def withPrintWriter(file: File, op: PrintWriter => Unit) = {
        val writer = new PrintWriter(file)
        try {
            op(writer)
        } finally {
            writer.close()
        }
    }

    withPrintWriter(
        new File("date.txt"),
        writer => writer.println(new java.util.Date)
    )


    def withPrintWriter2(file: File)(op: PrintWriter => Unit) = {
        val writer = new PrintWriter(file)
        try {
            op(writer)
        } finally {
            writer.close()
        }
    }

    // currying using curly braces
    val file = new File("date.txt")
    withPrintWriter2(file) { writer =>
        writer.println(new java.util.Date)
    }
}
