package chapter_19_type_parameterization

class Queue1[T] private( private val leading: List[T],
						 private val trailing: List[T]) {

	// an auxiliary constructor
	//def this(elems: T*) = this(elems.toList, Nil)

	private def mirror =
		if (leading.isEmpty)
			new Queue1(trailing.reverse, Nil)
		else
			this

	def head: T = mirror.leading.head

	def tail: Queue1[T] = {
		val q = mirror
		new Queue1(q.leading.tail, q.trailing)
	}

	def enqueue(x: T) =
		new Queue1(leading, x :: trailing)
}

object Queue1 {
	// constructs a queue with initial elements `xs'
	// alternative to an auxiliary constructor
	def apply[E](xs: E*) = new Queue1[E](xs.toList, Nil)
}
