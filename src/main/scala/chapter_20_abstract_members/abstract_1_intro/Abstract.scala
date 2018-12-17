package chapter_20_abstract_members.abstract_1_intro

trait Abstract {

	//	an abstract type
	type T

	//	an abstract method
	def transform(x: T): T

	//	an abstract val
	val initial: T

	//	an abstract var
	var current: T
}
