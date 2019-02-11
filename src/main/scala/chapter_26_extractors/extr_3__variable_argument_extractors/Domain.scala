package chapter_26_extractors.extr_3__variable_argument_extractors

object Domain {

	// The injection method (optional)
	def apply(parts: String*): String =
		parts.reverse.mkString(".")

	// The extraction method (mandatory)
	def unapplySeq(whole: String): Option[Seq[String]] =
		Some(whole.split("\\.").reverse)
}
