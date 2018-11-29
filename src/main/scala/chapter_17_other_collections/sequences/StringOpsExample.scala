package chapter_17_other_collections.sequences

object StringOpsExample extends App {

	// treat string as sequence
	def hasUpperCase(s: String) = s.exists(_.isUpper)

}
