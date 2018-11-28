package chapter_16_lists.first_order_methods

object Length {

//	On lists, unlike arrays, length is a relatively expensive operation. It needs to traverse the whole list to
//	find its end, and therefore takes time proportional to the number of elements in the list. That's why it's
//	not a good idea to replace a test such as xs.isEmpty by xs.length == 0

	List(1, 2, 3).length

}
