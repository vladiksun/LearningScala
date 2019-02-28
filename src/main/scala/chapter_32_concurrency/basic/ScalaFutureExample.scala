package chapter_32_concurrency.basic

import scala.concurrent.Future

object ScalaFutureExample extends App {

	import scala.concurrent.ExecutionContext.Implicits.global

	val fut = Future {
		Thread.sleep(5000)
		21 + 21
	}

	println( fut.isCompleted )
	println( fut.value )

	Thread.sleep(5000)

	println( fut.isCompleted )
	println( fut.value )




}
