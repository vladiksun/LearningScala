package chapter_12_traits.how_trait_works

class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
	override def toString = "green"

	override def philosophize2(): Unit = {
		println("It ain't easy being " + toString + "!")
	}

	override def philosophize3(): Unit =
		println("It ain't easy being " + toString + "!")
}
