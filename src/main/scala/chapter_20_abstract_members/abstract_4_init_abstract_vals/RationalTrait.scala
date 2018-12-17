package chapter_20_abstract_members.abstract_4_init_abstract_vals

//	Abstract vals sometimes play a role analogous to superclass parameters: they let you provide details in
//	a subclass that are missing in a superclass. This is particularly important for traits, because traits don't
//	have a constructor to which you could pass parameters. So the usual notion of parameterizing a trait
//	works via abstract vals that are implemented in subclasses.

trait RationalTrait {
	val numerArg: Int
	val denomArg: Int
}
