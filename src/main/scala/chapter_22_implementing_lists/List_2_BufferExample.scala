package chapter_22_implementing_lists

import scala.collection.mutable.ListBuffer

object List_2_BufferExample {

	val xs = List(1,2,3)

//	The typical access pattern for a list is recursive. For instance, to increment every element of a list
//	without using map you could write:

	def incAllRecursive(xs: List[Int]): List[Int] = xs match {
		case List() => List()
		case x :: xs1 => x + 1 :: incAllRecursive(xs1) // very very very slow !!!!!!!!!!!!!
	}

//	One shortcoming of this program pattern is that it is not tail recursive. Note that the recursive call
//	to incAll above occurs inside a :: operation. Therefore each recursive call requires a new stack frame.

//	On today's virtual machines this means that you cannot apply incAll to lists of much more than about
//	30,000 to 50,000 elements. This is a pity. How do you write a version of incAll that can work on lists of
//	arbitrary size (as much as heap-capacity allows)?

//	maybe loop ????
	def incAllLoop(xs: List[Int]): List[Int] = {
		var result = List[Int]()
		for (x <- xs)
			result = result ::: List(x + 1) // a very inefficient approach
		result
	}
//	This is terribly inefficient. Because ::: takes time proportional to the length of its first operand, the
//	whole operation takes time proportional to the square of the length of the list. This is clearly
//	unacceptable.

//	Use List buffer to make it fast
	def incAllWithListBuffer(xs: List[Int]): List[Int] = {
		val buffer = new ListBuffer[Int]
		for (x <- xs) buffer += x + 1
		buffer.toList
	}

//	This is a very efficient way to build lists. In fact, the list buffer implementation is organized so that
//	both the append operation (+=) and the toList operation take (very short) constant time.

}
