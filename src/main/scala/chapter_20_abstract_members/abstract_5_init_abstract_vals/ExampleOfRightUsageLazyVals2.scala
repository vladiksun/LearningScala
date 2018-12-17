package chapter_20_abstract_members.abstract_5_init_abstract_vals

object ExampleOfRightUsageLazyVals2 extends App {

	val x = 2

	val testLazy = new LazyRationalTrait {
		val numerArg = 1 * x
		val denomArg = 2 * x
	}

	println(testLazy)

//	No pre-initialization is needed. It's instructive to trace the sequence of initializations that lead to the
//	string 1/2 to be printed in the code above:

//	1. A fresh instance of LazyRationalTrait gets created and the initialization code
//			of LazyRationalTrait is run. This initialization code is empty; none of the fields
//			of LazyRationalTrait is initialized yet.
//	2. Next, the primary constructor of the anonymous subclass defined by the new expression is
//			executed. This involves the initialization of numerArg with 2 and denomArg with 4.
//	3. Next, the toString method is invoked on the constructed object by the interpreter, so that the
//	resulting value can be printed.
//	4. Next, the numer field is accessed for the first time by the toString method in
//			traitLazyRationalTrait, so its initializer is evaluated.
//	5. The initializer of numer accesses the private field, g, so g is evaluated next. This evaluation
//			accesses numerArg and denomArg, which were defined in Step 2.
//	6. Next, the toString method accesses the value of denom, which causes denom's evaluation. The
//	evaluation of denom accesses the values of denomArg and g. The initializer of the g field is not
//			re-evaluated, because it was already evaluated in Step 5.
//	7. Finally, the result string "1/2" is constructed and printed.
}
