package chapter_16_lists.higher_order_methods

object DropWhileExample extends App {

//	The operation xs dropWhile p removes the longest prefix from list xs such that every element in the prefix satisfies p

	val words = List("the", "quick", "brown", "fox")

	val dropWhileTest = words dropWhile (_ startsWith "t")
	println(dropWhileTest) // List(quick, brown, fox)
}
