package chapter_32_concurrency.working_with_future

import scala.concurrent.Future

object FutureTransformation extends App {

	import scala.concurrent.ExecutionContext.Implicits.global

	val addFuture = Future { Thread.sleep(1000); 21 + 21 }
	val result = addFuture.map(x => x + 1)

	Thread.sleep(2000)
	println( result.value )



}
