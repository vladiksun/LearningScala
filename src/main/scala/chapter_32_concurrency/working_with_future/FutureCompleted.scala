package chapter_32_concurrency.working_with_future

import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}

object FutureCompleted extends App {

	//	The successful factory method creates a future that has already succeeded:
	Future.successful { 21 + 21 }

	//	The failed method creates a future that has already failed:
	Future.failed(new Exception("bummer!"))

	//	The fromTry method creates an already completed future from a Try:
	Future.fromTry(Success { 21 + 21 })
	Future.fromTry(Failure(new Exception("bummer!")))


	// 	The most general way to create a future is to use a Promise. Given a promise you can obtain a future
	//	that is controlled by the promise. The future will complete when you complete the promise.
	val pro = Promise[Int]
	val fut = pro.future
	fut.value	//	Option[scala.util.Try[Int]] = None

	pro.success(42)
	fut.value
}
