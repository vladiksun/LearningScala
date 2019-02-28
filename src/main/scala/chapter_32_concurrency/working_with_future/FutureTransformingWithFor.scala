package chapter_32_concurrency.working_with_future

import scala.concurrent.Future

object FutureTransformingWithFor extends App {

	import scala.concurrent.ExecutionContext.Implicits.global

	val fut1 = Future { Thread.sleep(1000); 21 + 21 }
	val fut2 = Future { Thread.sleep(1000); 23 + 23 }

	val result = for {
					x <- fut1
					y <- fut2
				} yield x + y

	Thread.sleep(2000)

	println( result.value )	// Some(Success(88))
}
