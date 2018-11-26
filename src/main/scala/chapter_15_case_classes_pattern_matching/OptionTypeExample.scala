package chapter_15_case_classes_pattern_matching

object OptionTypeExample extends App {

	val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

	capitals get "France"  // res23: Option[String] = Some(Paris)

	def show(x: Option[String]) = x match {
		case Some(s) => s
		case None => "?"
	}
}
