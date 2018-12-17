package chapter_20_abstract_members.abstract_6_abstract_types

object FoodExampleViaGenerics extends App {

	class Food
	abstract class Animal[T <: Food] {
		def eat(food: T)
	}


	class Grass extends Food
	class Cow extends Animal[Grass] {

		override def eat(food: Grass) = {}
	}

	class Fish extends Food

	val bessy: Animal[Grass] = new Cow

//	error: type mismatch
//	bessy eat (new Fish)
}
