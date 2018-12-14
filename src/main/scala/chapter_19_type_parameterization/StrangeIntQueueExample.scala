package chapter_19_type_parameterization

object StrangeIntQueueExample {

	class StrangeIntQueue extends Queue1[Int] {
		override def enqueue(x: Int) = {
			println(math.sqrt(x))
			super.enqueue(x)
		}
	}

	// wil not compile
	// val x: Queue1[Any] = new StrangeIntQueue
}
