package chapter_32_concurrency.basic

import scala.concurrent.Future
import scala.util.Try

object ScalaFutureFailExample extends App {

	import scala.concurrent.ExecutionContext.Implicits.global

	val futureFailing: Future[Int] = Future {
		Thread.sleep(1000)
		21/0
	}

	Thread.sleep(2000)

	val failingValue: Option[Try[Int]] = futureFailing.value

	println( failingValue ) // Some(Failure(java.lang.ArithmeticException: / by zero))

}
