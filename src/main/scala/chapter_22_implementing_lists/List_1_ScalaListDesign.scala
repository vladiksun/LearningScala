package chapter_22_implementing_lists

object List_1_ScalaListDesign {

//	The class has a type parameter T. The +in front of
//	this type parameter specifies that lists are covariant
	val xs = List(1, 2, 3) 	//	xs: List[Int] = List(1, 2, 3)
	var ys: List[Any] = xs	//	ys: List[Any] = List(1, 2, 3)

//	All list operations can be defined in terms of three basic methods:
	xs.isEmpty
	xs.head
	xs.tail

}
