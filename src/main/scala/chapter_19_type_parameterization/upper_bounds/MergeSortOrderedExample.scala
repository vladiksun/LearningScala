package chapter_19_type_parameterization.upper_bounds

object MergeSortOrderedExample extends App {

	// T is upper bound to Ordered
	def orderedMergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {
		def merge(xs: List[T], ys: List[T]): List[T] =
			(xs, ys) match {
				case (Nil, _) => ys
				case (_, Nil) => xs
				case (x :: xsRest, y :: ys1) =>
					if (x < y) x :: merge(xsRest, ys)
					else y :: merge(xs, ys1)
			}

		val n = xs.length / 2
		if (n == 0) xs
		else {
			val (ys, zs) = xs splitAt n
			merge(orderedMergeSort(ys), orderedMergeSort(zs))
		}
	}


	val people = List(
		new PersonOrdered("Larry", "Wall"),
		new PersonOrdered("Anders", "Hejlsberg"),
		new PersonOrdered("Guido", "van Rossum"),
		new PersonOrdered("Alan", "Kay"),
		new PersonOrdered("Yukihiro", "Matsumoto")
	)

	val sortedPeople = orderedMergeSort(people)


}
