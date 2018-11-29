package chapter_16_lists.higher_order_methods

object ForAll_Exists_PredicateExample extends App {

//	The operation xs forall p takes as arguments a list xs and a predicate p. Its result is true if all elements
//	in the list satisfy p.
//	Conversely, the operation xs exists p returns true if there is an element in xs that
//	satisfies the predicate p. For instance, to find out whether a matrix represented as a list of lists has a
//	row with only zeroes as elements:

	def hasZeroRow(m: List[List[Int]]) =
		m exists (row => row forall (_ == 0))

}
