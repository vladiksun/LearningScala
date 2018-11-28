package chapter_16_lists.first_order_methods

object InitAndLast {

//	Unlike head and tail, which both run in constant time, init and last need to traverse the whole list to
//	compute their result. As a result, they take time proportional to the length of the list.

	val abcde = List('a', 'b', 'c', 'd', 'e')

	abcde.last  //	res4: Char = e
	abcde.init  //  res5: List[Char] = List(a, b, c, d)

}
