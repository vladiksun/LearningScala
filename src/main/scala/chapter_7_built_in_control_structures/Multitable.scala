package chapter_7_built_in_control_structures
import scala.collection.immutable

object Multitable extends App {

    // Returns a row as a sequence
    def makeRowSeq(row: Int): immutable.Seq[String] =
        for (col <- 1 to 10) yield {
            val prod: String = (row * col).toString
            val padding: String = " " * (4 - prod.length)
            padding + prod
        }

    // Returns a row as a string
    def makeRow(row: Int) = makeRowSeq(row).mkString

    // Returns table as a string with one row per line
    def multiTable() = {
        val tableSeq: immutable.IndexedSeq[String] = // a sequence of row strings
            for (row <- 1 to 10)
                yield makeRow(row)

        tableSeq.mkString("\n")
    }

    print(multiTable())
}
