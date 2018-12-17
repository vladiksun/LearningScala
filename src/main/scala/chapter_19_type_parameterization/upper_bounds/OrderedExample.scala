package chapter_19_type_parameterization.upper_bounds

object OrderedExample extends App {

	val robert = new PersonOrdered("Robert", "Jones")
	val sally = new PersonOrdered("Sally", "Smith")

	assert(robert < sally)
}
