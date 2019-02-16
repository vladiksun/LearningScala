package chapter_29_modular_programming.recipe

trait SimpleFoods {
    this: FoodCategories =>

    object Pear extends Food("Pear")

    def allFoods = List(Apple, Orange, Cream, Sugar)
    def allCategories:List[FoodCategory] = List()
}
