package chapter_16_lists.first_order_methods

object Drop_take_splitAt extends App {

	val abcde = List('a', 'b', 'c', 'd', 'e')

	val taken = abcde take 2
	assert(taken == List('a', 'b'))

	val dropped = abcde drop 2
	assert(dropped == List('c', 'd', 'e'))

	val splitted = abcde splitAt 2
	assert(splitted == (List('a', 'b'), List('c', 'd', 'e')))
}
