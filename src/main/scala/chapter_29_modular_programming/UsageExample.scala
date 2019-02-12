package chapter_29_modular_programming

import chapter_29_modular_programming.recipe.{Recipe, SimpleBrowser, SimpleDatabase}

object UsageExample extends App {

    val apple = SimpleDatabase.foodNamed("Apple").get

    val recipesWithApple: List[Recipe] = SimpleBrowser.recipesUsing(apple)
}
