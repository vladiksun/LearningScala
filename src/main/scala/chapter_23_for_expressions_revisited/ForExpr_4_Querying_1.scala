package chapter_23_for_expressions_revisited

object ForExpr_4_Querying_1 extends App {

	case class Book(title: String, authors: String*)

	val booksDb: List[Book] =
		List(
			Book(
				"Structure and Interpretation of Computer Programs",
				"Abelson, Harold", "Sussman, Gerald J."
			),
			Book(
				"Principles of Compiler Design",
				"Aho, Alfred", "Ullman, Jeffrey"
			),
			Book(
				"Programming in Modula-2",
				"Wirth, Niklaus"
			),
			Book(
				"Elements of ML Programming",
				"Ullman, Jeffrey"
			),
			Book(
				"The Java Language Specification", "Gosling, James",
				"Joy, Bill", "Steele, Guy", "Bracha, Gilad"
			)
		)

	def books = booksDb


//	To find the titles of all books whose author's last name is "Gosling":
	val goslingBooksTitles = for {
								book <- books
									author <- book.authors if author startsWith "Gosling"
							} yield book.title
	println(goslingBooksTitles)
}
