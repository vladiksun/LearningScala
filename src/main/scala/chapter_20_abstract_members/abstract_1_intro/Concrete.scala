package chapter_20_abstract_members.abstract_1_intro

class Concrete extends Abstract {

	override type T = String

	def transform(x: String) = x + x

	val initial = "hi"

	var current = initial
}
