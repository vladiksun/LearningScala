package chapter_16_lists.first_order_methods

object Apply_and_indices extends App {

//	Random element selection is supported through the apply method; however it is a less common
//	operation for lists than it is for arrays.

	val abcde = List('a', 'b', 'c', 'd', 'e')
	abcde apply 2 // rare in Scala

//	As for all other types, apply is implicitly inserted when an object appears in the function position in a
//	method call. So the line above can be shortened to:

	abcde(2) // rare in Scala  | xs apply n equals (xs drop n).head

	val indices_test = abcde.indices
	//assert(indices_test == Range(0, 1, 2, 3, 4))

}
