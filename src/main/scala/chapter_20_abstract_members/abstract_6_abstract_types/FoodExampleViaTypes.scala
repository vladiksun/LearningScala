package chapter_20_abstract_members.abstract_6_abstract_types

import chapter_20_abstract_members.abstract_8_refinement_types.RefinementTypesExample.Grass

object FoodExampleViaTypes extends App {

	class Food
	abstract class Animal {
		type SuitableFood <: Food  // The type has an upper bound, Food, which is expressed by the "<: Food" clause
		def eat(food: SuitableFood)
	}


	class Grass (val grassType:String) extends Food
	class Cow extends Animal {
		type SuitableFood = Grass
		override def eat(food: Grass) = { println("I am eating: " + food.grassType)}
	}

	class Fish extends Food

	val bessy = new Cow

//	error: type mismatch
//	bessy eat (new Fish)

	bessy eat(new bessy.SuitableFood("simple grass"))
	bessy eat(new Grass("simple grass"))

//	need to use type refinement
	val cowAnimal: Animal{ type SuitableFood = Grass } = new Cow
	cowAnimal eat(new Grass("simple grass"))

}
