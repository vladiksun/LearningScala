package chapter_7_built_in_control_structures

object ForLoopYield extends App {

    val filesHere = new java.io.File(".").listFiles

    def fileLines(file: java.io.File) =
        scala.io.Source.fromFile(file).getLines().toList

    def scalaFiles =
        for {
            file <- filesHere if file.getName.endsWith(".scala")
        } yield file

    val forLineLengths =
        for {
            file <- filesHere
            if file.getName.endsWith(".scala")
                line <- fileLines(file)
                trimmed = line.trim
                if trimmed.matches(".*for.*")
        } yield trimmed.length

////////////////////////////////////////////////////////////////
	private val opGroups = Array(
		Set("1", "2"),
		Set("3", "4"),
	)
	private val countMap = {
        val assocs =
            for {
                i <- opGroups.indices // generator 1
                op <- opGroups(i)     // generator 2
            } yield op -> i
        assocs.toMap
    }
/////////////////////////////////////////////////////////////////
}
