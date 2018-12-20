package chapter_9_control_abstraction

object Currying2 extends App {

	//  currying, obvious syntax.
	val zscore = (mean: Int, sd: Int) => (x: Int) => (x - mean)/sd
}
