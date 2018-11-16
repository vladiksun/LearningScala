package chapter_12_traits.thin_vs_rich

trait CharSequence {
	def charAt(index: Int): Char
	def length: Int
	def subSequence(start: Int, end: Int): CharSequence
	def toString(): String
}
