package chapter_32_concurrency.working_with_future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureFilterAndCollect extends App {

	val fut = Future { 42 }

	val valid = fut.filter(res => res > 0)
	val invalid = fut.filter(res => res < 0)

	Thread.sleep(2000)

	println( valid.value )
	println( invalid.value )

}
