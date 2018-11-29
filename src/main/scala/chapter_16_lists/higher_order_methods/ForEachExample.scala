package chapter_16_lists.higher_order_methods

object ForEachExample extends App {

	var sum = 0
	List(1, 2, 3, 4, 5) foreach (sum += _)

}
