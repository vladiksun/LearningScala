package chapter_20_abstract_members.abstract_2_vals

abstract class Fruit {
	val v: String // `v' for value
	def m: String // `m' for method
}

abstract class Apple extends Fruit {
	val v: String
	val m: String // OK to override a `def' with a `val'
}

abstract class BadApple extends Fruit {
	// ERROR: cannot override a `val' with a `def'
//	def v: String

	def m: String
}