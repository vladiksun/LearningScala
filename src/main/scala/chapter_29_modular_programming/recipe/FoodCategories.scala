package chapter_29_modular_programming.recipe

trait FoodCategories {

    case class FoodCategory(name: String, foods: List[Food])

    def allCategories: List[FoodCategory]
}
