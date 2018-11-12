package chapter_9_control_abstraction


// Use of a higher order functions
object FileMatcher {

	private def filesHere = new java.io.File(".").listFiles

	// right
	private def filesMatching(matcher: String => Boolean) =
		for (file <- filesHere; if matcher(file.getName))
			yield file

	def filesEnding(query: String) =
		filesMatching(_.endsWith(query))

	def filesContaining(query: String) =
		filesMatching(_.contains(query))

	def filesRegex(query: String) =
		filesMatching(_.matches(query))

	/*The function literals shown in this example use the placeholder syntax, introduced in the previous
			chapter, which may not as yet feel very natural to you. So here's a clarification of how placeholders are
	used: The function literal _.endsWith(_), used in the filesEnding method, means the same thing as:*/

	def filesEnding2(query: String) =
		filesMatching((fileName: String) => fileName.endsWith(query))

	def filesEnding3(query: String) =
		filesMatching(fileName => fileName.endsWith(query))
}
