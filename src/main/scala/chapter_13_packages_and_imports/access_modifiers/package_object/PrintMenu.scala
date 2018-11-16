package chapter_13_packages_and_imports.access_modifiers.package_object

import chapter_13_packages_and_imports.test_imports.Fruits

object PrintMenu {

	def main(args: Array[String]) = {
		for (fruit <- Fruits.menu) {
			// method is also imported
			showFruit(fruit)
		}
	}
}
