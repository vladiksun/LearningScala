package chapter_19_type_parameterization

class Queue3[+T] private(
								private[this] var leading: List[T],
								private[this] var trailing: List[T]
						) {
	private def mirror() =
		if (leading.isEmpty) {
			while (!trailing.isEmpty) {
				leading = trailing.head :: leading
				trailing = trailing.tail
			}
		}
	def head: T = {
		mirror()
		leading.head
	}
	def tail: Queue3[T] = {
		mirror()
		new Queue3(leading.tail, trailing)
	}
	def enqueue[U >: T](x: U) =
		new Queue3[U](leading, x :: trailing)
}

object Queue3 {
	// constructs a queue with initial elements `xs'
	// alternative to an auxiliary constructor
	def apply[E](xs: E*) = new Queue3[E](xs.toList, Nil)
}