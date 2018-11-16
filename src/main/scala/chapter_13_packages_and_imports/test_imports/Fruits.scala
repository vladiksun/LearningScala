package chapter_13_packages_and_imports.test_imports

// easy access to Fruit
import chapter_13_packages_and_imports.imports.Fruit

// easy access to all members of the package
import chapter_13_packages_and_imports.imports._

object Fruits {
	object Apple extends Fruit("apple", "red")
	object Orange extends Fruit("orange", "orange")
	object Pear extends Fruit("pear", "yellowish")

	val menu = List(Apple, Orange, Pear)

	def showFruit(fruit: Fruit) = {

		import fruit._

		// instead of fruit.name and fruit.color
		println(name + "s are " + color)
	}
}
