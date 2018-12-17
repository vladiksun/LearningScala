package chapter_20_abstract_members.abstract_5_init_abstract_vals

object ExampleOfRightUsagePreInit extends App {

	val x = 2

	// Pre-initialized fields
	new {
		val numerArg = 1 * x
		val denomArg = 2 * x
	} with RationalTrait

	// object // Pre-initialized fields
	object twoThirds extends {
		val numerArg = 2
		val denomArg = 3
	} with RationalTrait


	// class // Pre-initialized fields
	class RationalClass(n: Int, d: Int) extends {
		val numerArg = n
		val denomArg = d
	} with RationalTrait {

		def + (that: RationalClass) = new RationalClass(
			numer * that.denom + that.numer * denom,
			denom * that.denom
		)
	}

}
