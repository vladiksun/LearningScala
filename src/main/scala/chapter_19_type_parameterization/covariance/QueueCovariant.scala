package chapter_19_type_parameterization.covariance

class QueueCovariant[+T] private(	private val leading: List[T],
						 			private val trailing: List[T]) {

	// an auxiliary constructor
	//def this(elems: T*) = this(elems.toList, Nil)

	private def mirror =
		if (leading.isEmpty)
			new QueueCovariant(trailing.reverse, Nil)
		else
			this

	def head: T = mirror.leading.head

	def tail: QueueCovariant[T] = {
		val q = mirror
		new QueueCovariant(q.leading.tail, q.trailing)
	}

	// polymorphic covariance
//	The new definition gives enqueue a type parameter U, and with the syntax, "U >: T", defines T as the
//	lower bound for U. As a result, U is required to be a supertype of T
	def enqueue[U >: T](x: U) =
		new QueueCovariant[U](leading, x :: trailing)
}

object QueueCovariant {
	// constructs a queue with initial elements `xs'
	// alternative to an auxiliary constructor
	def apply[E](xs: E*) = new QueueCovariant[E](xs.toList, Nil)
}


