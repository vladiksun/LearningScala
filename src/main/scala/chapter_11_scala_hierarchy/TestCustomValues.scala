package chapter_11_scala_hierarchy

object TestCustomValues extends App {

//	In this example, money refers to an instance of the value class. It is of type Dollars in Scala source
//			code, but the compiled Java bytecode will use type Int directly.
	val money = new Dollars(1000000)


	val dollars = new Dollars(1000)
	val francs = new SwissFrancs(1000)

}
