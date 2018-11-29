package chapter_16_lists.higher_order_methods

object PartitionExample extends App {

//	The partition method is like filter but returns a pair of lists. One list contains all elements for which the
//	predicate is true, while the other contains all elements for which the predicate is false. It is defined by
//	the equality:
//	xs partition p equals (xs filter p, xs filter (!p(_)))

	val partitionTuple = List(1, 2, 3, 4, 5) partition (_ % 2 == 0)
	println(partitionTuple)
	println(partitionTuple._1)
	println(partitionTuple._2)
}
