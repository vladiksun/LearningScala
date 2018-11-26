package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model._

object PatternsEverywhereExample extends App {

//	Patterns in variable definitions
//	Anytime you define a val or a var, you can use a pattern instead of a simple identifier. For example, you
//	can take apart a tuple and assign each of its parts to its own variable
	val myTuple = (123, "abc")
	val (number, string) = myTuple

	//	Patterns in variable definitions
//	If you know the precise case class you
//	are working with, then you can deconstruct it with a pattern
	val exp = new BinOp("*", Number(5), Number(1))
	val BinOp(op, left, right) = exp


//	Case sequences as partial functions
	val withDefault: Option[Int] => Int = {
		case Some(x) => x
		case None => 0
	}

	withDefault(Some(10))
	withDefault(None)

	val second: PartialFunction[List[Int],Int] = {
		case x :: y :: _ => y
	}
	second.isDefinedAt(List(5,6,7))


//	Patterns in for expressions
	val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

	for ((country, city) <- capitals)
		println("The capital of " + country + " is " + city)

	val results = List(Some("apple"), None, Some("orange"))

	for (Some(fruit) <- results)  // None is not a match
		println(fruit)
}
