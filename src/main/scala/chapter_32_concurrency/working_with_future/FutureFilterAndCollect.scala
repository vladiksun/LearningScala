package chapter_32_concurrency.working_with_future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Try

object FutureFilterAndCollect extends App {

	val fut = Future { 42 }

	val valid = fut.filter(res => res > 0)
	val invalid = fut.filter(res => res < 0)
	val validViaFor = for (res <- fut if res > 0) yield res
	val validViaCollect = fut collect { case res if res > 0 => res + 46 }

	Thread.sleep(2000)

	val validTest: Option[Try[Int]] = valid.value
	val invalidTest: Option[Try[Int]] = invalid.value

	println( validTest )
	println( invalidTest ) // res1: Option[scala.util.Try[Int]] = Some(Failure(java.util.NoSuchElementException: Future.filter predicate is not satisfied))

	println( validViaFor.value ) // Option[scala.util.Try[Int]] = Some(Success(42))

}
