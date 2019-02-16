package chapter_29_modular_programming.recipe

object SimpleDatabase extends Database with SimpleFoods with SimpleRecipes {

    def allRecipes: List[Recipe] = List(FruitSalad)

    private var categories = List(
        FoodCategory("fruits", List(Apple, Orange)),
        FoodCategory("misc", List(Cream, Sugar)))

    override def allCategories = categories
}

object SimpleBrowser extends Browser {

    val database = SimpleDatabase

}