package chapter_23_for_expressions_revisited

object ForExpr_2_Understand_1 extends App {

	val lara = Person("Lara", false)
	val bob = Person("Bob", true)
	val julie = Person("Julie", false, lara, bob)

	val persons = List(lara, bob, julie)

	//				  | generator   |	definition   | filter 		   |
	var names = for (p <- persons;    n = p.name;   if n startsWith "Ju")
					 yield n

	names = for {
					p <- persons 			// a generator
					n = p.name 				// a definition
					if n startsWith "Ju" 	// a filter
			} yield n

}
