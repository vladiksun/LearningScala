package chapter_30_scala_equality.examples.example2

trait Tree[+T] {

	def elem: T

	def left: Tree[T]

	def right: Tree[T]
}
