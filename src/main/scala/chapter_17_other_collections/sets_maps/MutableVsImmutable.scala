package chapter_17_other_collections.sets_maps

object MutableVsImmutable  extends App {

	val peopleImmutable = Set("Nancy", "Jane") // immutable Set by default

	// this wil not work
//	peopleImmutable += "Bob"

	var peopleImmutable2 = Set("Nancy", "Jane") // immutable Set by default but declared as VAR
//	First, a new collection will be created, and
//	then peopleImmutable2 will be reassigned to refer to the new collection
	peopleImmutable2 += "Bob"

//	After this series of statements, the people variable refers to a new immutable set, which contains the
//	added string, "Bob". The same idea applies to any method ending in =, not just the+= method. Here's
//	the same syntax used with the -= operator, which removes an element from a set, and the ++= operator,
//	which adds a collection of elements to a set:

	peopleImmutable2 -= "Jane"
	peopleImmutable2 ++= List("Tom", "Harry")


	var capital = Map("US" -> "Washington", "France" -> "Paris")
	capital += ("Japan" -> "Tokyo")
	println(capital("France"))
}
