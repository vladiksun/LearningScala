package chapter_30_scala_equality.examples.example2

object EmptyTree extends Tree[Nothing] {

	def elem =
		throw new NoSuchElementException("EmptyTree.elem")

	def left =
		throw new NoSuchElementException("EmptyTree.left")

	def right =
		throw new NoSuchElementException("EmptyTree.right")
}
