package chapter_19_type_parameterization

class Cell[T](init: T) {
	private[this] var current = init

	def get = current

	def set(x: T) = { current = x }
}