package chapter_9_control_abstraction

object Currying1 extends App {

	def plainOldSum(x: Int, y: Int) = x + y
	println(plainOldSum(1, 2))

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	def curriedSum(x: Int)(y: Int) = x + y
	curriedSum(1)(2)

	// first step of currying is equivalent to
	def firstFunc(x: Int) = (y: Int) => x + y

	// second step of currying is equivalent to
	val secondFunc = firstFunc(1)

	println(secondFunc(2))
}
