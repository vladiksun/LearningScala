package chapter_20_abstract_members.abstract_7_path_dependent_types

object DependentPathExample extends App {

	class Food
	abstract class Animal {
		type SuitableFood <: Food  // The type has an upper bound, Food, which is expressed by the "<: Food" clause
		def eat(food: SuitableFood)
	}


	class Grass extends Food
	class Cow extends Animal {
		type SuitableFood = Grass
		override def eat(food: Grass) = {}
	}


	class DogFood extends Food
	class Dog extends Animal {
		type SuitableFood = DogFood
		override def eat(food: DogFood) = {}
	}

	val bessy = new Cow
	val lassie = new Dog

//	error: type mismatch
//	lassie eat (new bessy.SuitableFood)

	val bootsie = new Dog
	lassie eat (new bootsie.SuitableFood)
}
