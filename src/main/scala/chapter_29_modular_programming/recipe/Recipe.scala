package chapter_29_modular_programming.recipe

class Recipe(
                val name: String,
                val ingredients: List[Food],
                val instructions: String
            ) {

    override def toString = name

}