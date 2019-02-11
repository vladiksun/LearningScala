package chapter_26_extractors.extr_2_zero_or_one_variable

object UpperCase {

	def unapply(s: String): Boolean =
		s.toUpperCase == s
}
