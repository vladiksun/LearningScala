package chapter_16_lists.higher_order_methods

object FlatMapExample extends App {

	val words = List("the", "quick", "brown", "fox")
	val flatMapped = words flatMap (_.toList)
	println("flatMapped: " + flatMapped)

	val flatMapped2 = List.range(1, 5) flatMap (
			i => List.range(1, i) map (j => (i, j))
			)
	println("flatMapped2: " + flatMapped2)

	val flatMapped2ViaFor = {
		for (i <- List.range(1, 5);
			 	j <- List.range(1, i))
			yield (i, j)
	}
}
