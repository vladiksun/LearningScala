package chapter_23_for_expressions_revisited

object ForExpr_1_SimplifyUsingFor extends App {

	val lara = Person("Lara", false)
	val bob = Person("Bob", true)
	val julie = Person("Julie", false, lara, bob)

	val persons = List(lara, bob, julie)
//	Now, say you want to find out the names of all pairs of mothers and their children in that list.
//	Using map, flatMap and filter, you can formulate the following query:

	val mothersVsChildren1 = persons
							.filter(p => !p.isMale)
							.flatMap(p => p.children map (c => (p.name, c.name)))

	println(mothersVsChildren1)
	assert(mothersVsChildren1 == List(("Julie", "Lara"), ("Julie", "Bob")))

//	You could optimize this example a bit by using a withFilter call instead of filter. This would avoid the
//	creation of an intermediate data structure for female persons:
	val mothersVsChildren2 = persons
							.withFilter(p => !p.isMale)
							.flatMap (p => p.children map (c => (p.name, c.name)))

	assert(mothersVsChildren2 == List(("Julie", "Lara"), ("Julie", "Bob")))

//	These queries do their job, but they are not exactly trivial to write or understand. Is there a simpler
//	way? In fact, there is.

	val mothersVsChildren3 = for (p <- persons; if !p.isMale; 	// outer loop with filter
								  		c <- p.children)		// inner loop
							 yield (p.name, c.name)

	assert(mothersVsChildren3 == List(("Julie", "Lara"), ("Julie", "Bob")))

}
