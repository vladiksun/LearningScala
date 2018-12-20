package chapter_9_control_abstraction

object Currying2 extends App {

	//  currying, obvious syntax.
	val zscore = (mean: Int, sd: Int) => (x: Int) => (x - mean)/sd

	//  currying, obvious syntax.
	def zscore1(mean: Int, sd: Int) = (x: Int) => (x - mean)/sd

	//	currying, sugar syntax. but then:
	def zscore2(mean: Int, sd: Int)(x: Int) = (x - mean)/sd

	val normer = zscore2(7, 4)(1)

	println(normer)
}
