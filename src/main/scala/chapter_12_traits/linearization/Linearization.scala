package chapter_12_traits.linearization

object Linearization extends App {

	class Animal
	trait Furry extends Animal
	trait HasLegs extends Animal
	trait FourLegged extends HasLegs
	class Cat extends Animal with Furry with FourLegged

}
