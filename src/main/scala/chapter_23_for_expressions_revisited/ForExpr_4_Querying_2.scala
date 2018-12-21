package chapter_23_for_expressions_revisited

object ForExpr_4_Querying_2 extends App {

	val books = ForExpr_4_Querying_1.books

//	Or to find the names of all authors who have written at least two books in the database:
	val withDuplicates = for (b1 <- books; b2 <- books if b1 != b2;
		 						a1 <- b1.authors; a2 <- b2.authors if a1 == a2)
								yield a1

	// method to remove duplicates
	def removeDuplicates1[A](xs: List[A]): List[A] = {
		if (xs.isEmpty) xs
		else
			xs.head :: removeDuplicates1(
				xs.tail filter (x => x != xs.head)
			)
	}

	def removeDuplicates2[A](xs: List[A]): List[A] = {
		if (xs.isEmpty) xs
		else
			xs.head :: removeDuplicates2(
				for (x <- xs.tail if x != xs.head) yield x
			)
	}

	def removeDuplicates3[A](xs: List[A]): List[A] = {
		xs.toSet.toList
	}

}
