package chapter_12_traits.stackable_modifications

object Test extends App {

	val queue = new MyQueue

	val queue2 = new BasicIntQueue with Doubling

	// first filter then increment
	val queue3 = new BasicIntQueue with Incrementing with Filtering

	// first increment then filter
	val queue4 = new BasicIntQueue with Filtering with Incrementing
}
