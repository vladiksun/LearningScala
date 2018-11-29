package chapter_17_other_collections.sequences

object ArrayExample extends App {

	val fiveInts = new Array[Int](5)
	val fiveToOne = Array(5, 4, 3, 2, 1)

	fiveInts(0) = fiveToOne(4)
}
