package chapter_32_concurrency.basic

import scala.concurrent.Future

object ScalaFutureFailExample extends App {

	import scala.concurrent.ExecutionContext.Implicits.global

	val futureFailing = Future {
		Thread.sleep(1000)
		21/0
	}

	Thread.sleep(2000)

	println( futureFailing.value ) // Some(Failure(java.lang.ArithmeticException: / by zero))

}
