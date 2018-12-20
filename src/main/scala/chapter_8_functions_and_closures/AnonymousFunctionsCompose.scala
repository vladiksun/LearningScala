package chapter_8_functions_and_closures

object AnonymousFunctionsCompose extends App {

	def compose[R](g: R => R, h: R => R) = (x: R) => g(h(x))

	val compose2 = compose _
	val intComposeFunc:(Int => Int, Int => Int) => Int => Int = compose

	val func1 = compose[Int]({_*2}, {_-1})

	val func2 = compose[Int](_*2, _-1)

	println(s"Type of [ f ] is $func1.")
	println(func1(3))
}
