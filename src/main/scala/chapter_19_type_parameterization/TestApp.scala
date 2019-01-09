package chapter_19_type_parameterization

object TestApp extends App {

	// constructor is private
	// new Queue(List(1, 2), List(3))

	val q1 = Queue1(1, 2, 3) // use factory method

	val q2 = Queue2(1, 2, 3) // use factory method. But implementation is private

	val q3 = Queue3(1, 2, 3) // use factory method

	// def doesNotCompile(q: Queue1) = {}
	// def doesNotCompile(q: Queue2) = {}

	def doesCompile(q: Queue1[AnyRef]) = {}
	def doesCompile(q: Queue2[AnyRef]) = {}
	def doesCompile(q: Queue3[AnyRef]) = {}


}
