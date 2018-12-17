package chapter_20_abstract_members.abstract_4_init_abstract_vals

object Example extends App {

	val rationalImpl = new RationalTrait {
		override val numerArg: Int = 1
		override val denomArg: Int = 2
	}
}
