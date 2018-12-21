package chapter_21_implicit_conversions_and_parameters.implicits_5_implicit_parameters

object Example_1 extends App {

	class PreferredPrompt(val preference: String)
	class PreferredDrink(val preference: String)

	object Greeter {
		def greet(name: String)(implicit prompt: PreferredPrompt,
								drink: PreferredDrink) = {
			println("Welcome, " + name + ". The system is ready.")
			print("But while you work, ")
			println("why not enjoy a cup of " + drink.preference + "?")
			println(prompt.preference)
		}
	}

	val bobsPrompt = new PreferredPrompt("relax> ")
	val bobsDrink = new PreferredDrink("beer !!!!!!!!")
	Greeter.greet("Bob")(bobsPrompt, bobsDrink) // supply explicitly

	object JoesPrefs {
		implicit val prompt = new PreferredPrompt("Yes, master> ")
		implicit val drink = new PreferredDrink("tea")
	}

	import JoesPrefs._ 		// make an import to bring the implicit parameter to a scope
	Greeter.greet("Joe")
}
