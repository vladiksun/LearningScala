package chapter_20_abstract_members.abstract_8_refinement_types

object RefinementTypesExample extends App {

	class Food
	abstract class Animal {
		type SuitableFood <: Food  // The type has an upper bound, Food, which is expressed by the "<: Food" clause
		def eat(food: SuitableFood)
	}

	class Grass (val grassType:String) extends Food

	class Pasture {
		var animals: List[Animal { type SuitableFood = Grass }] = Nil
		// ...
	}

}
