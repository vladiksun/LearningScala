package chapter_29_modular_programming.recipe

object GotApples {

    def main(args: Array[String]) = {
        val db: Database = {
            if(args(0) == "student")
                StudentDatabase
            else
                SimpleDatabase
        }

        object browser extends Browser {
            val database:db.type = db
        }

        val apple = SimpleDatabase.foodNamed("Apple").get

        for(recipe <- browser.recipesUsing(apple))
            println(recipe)

        for (category <- db.allCategories)
            browser.displayCategory(category)
    }
}
