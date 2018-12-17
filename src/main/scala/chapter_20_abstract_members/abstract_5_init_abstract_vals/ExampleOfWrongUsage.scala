package chapter_20_abstract_members.abstract_5_init_abstract_vals

object ExampleOfWrongUsage extends App {

	val x = 2

	// wrong usage as require will fail. denomArg = 0 by default while the anonymous class is being initialized.
	new RationalTrait {
		val numerArg = 1 * x
		val denomArg = 2 * x
	}
}
