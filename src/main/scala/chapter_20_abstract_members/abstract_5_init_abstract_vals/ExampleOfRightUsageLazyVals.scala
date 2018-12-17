package chapter_20_abstract_members.abstract_5_init_abstract_vals

object ExampleOfRightUsageLazyVals extends App {

	object DemoNotLazy {
		val x: String =
		{
			println("initializing not lazy x"); // static block to catch init moment of Demo
			"done lazy"
		}
	}

	// As you can see, the moment you use Demo, its x field becomes initialized.
	println(DemoNotLazy)
	println(DemoNotLazy.x)


//	Now, initializing Demo does not involve initializing x. The initialization of x will be deferred until the
//	first time x is used. This is similar to the situation where x is defined as a parameterless method, using
//	a def. However, unlike a def, a lazy val is never evaluated more than once. In fact, after the first
//	evaluation of a lazy val the result of the evaluation is stored, to be reused when the same val is used
//	subsequently
	object DemoLazy {
		lazy val x: String =
		{
			println("initializing lazy x"); // static block to catch init moment of Demo
			"done lazy"
		}
	}

	println(DemoLazy)
	println(DemoLazy.x)

}
