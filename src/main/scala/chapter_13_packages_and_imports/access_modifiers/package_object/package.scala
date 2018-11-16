package chapter_13_packages_and_imports.access_modifiers

import chapter_13_packages_and_imports.imports.Fruit

package object package_object {

	def showFruit(fruit: Fruit) = {
		import fruit._

		println(name + "s are " + color)
	}
}
