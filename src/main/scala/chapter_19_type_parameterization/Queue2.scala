package chapter_19_type_parameterization

trait Queue2[T] {
	def head: T
	def tail: Queue2[T]
	def enqueue(x: T): Queue2[T]
}

object Queue2 {

	def apply[T](xs: T*): Queue2[T] =
		new QueueImpl[T](xs.toList, Nil)

	private class QueueImpl[T](private val leading: List[T],
							   private val trailing: List[T]
							  ) extends Queue2[T] {

		def mirror: QueueImpl[T] =
			if (leading.isEmpty)
				new QueueImpl(trailing.reverse, Nil)
			else
				this
		def head: T = mirror.leading.head

		def tail: QueueImpl[T] = {
			val q = mirror
			new QueueImpl(q.leading.tail, q.trailing)
		}

		def enqueue(x: T) = new QueueImpl(leading, x :: trailing)
	}
}
