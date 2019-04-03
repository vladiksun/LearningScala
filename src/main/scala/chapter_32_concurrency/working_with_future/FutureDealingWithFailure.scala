package chapter_32_concurrency.working_with_future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Try

object FutureDealingWithFailure extends App {

  val failure = Future { 42 / 0 }

  failure.value // Option[scala.util.Try[Int]] =Some(Failure(java.lang.ArithmeticException: / by zero))

  val expectedFailure: Future[Throwable] = failure.failed
  val expectedFailureVal: Option[Try[Throwable]] =  expectedFailure.value //  Some(Success(java.lang.ArithmeticException: / by zero))

  // TODO: learn more page 520
}
