package chapter_29_modular_programming.recipe

trait SimpleRecipes {
    this: SimpleFoods =>

    object FruitSalad extends Recipe(
        "fruit salad",
        List(Apple, Pear), // Uh oh
        "Mix it all together.")
}
