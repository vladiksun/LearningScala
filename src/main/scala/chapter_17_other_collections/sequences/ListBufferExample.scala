package chapter_17_other_collections.sequences

import scala.collection.mutable.ListBuffer

object ListBufferExample extends App {

	// ListBuffer is analog of java's ArrayList. It gives good performance on appending operation
	// Another reason to use ListBuffer instead of List is to prevent the potential for stack overflow.

//	You've also already seen list buffers in Section 17.1. A list buffer is like an array buffer except that it
//	uses a linked list internally instead of an array. If you plan to convert the buffer to a list once it is built
//	up, use a list buffer instead of an array buffer

	val buf = new ListBuffer[Int]
	buf += 1	// res4: buf.type = ListBuffer(1)
	buf += 2	// res5: buf.type = ListBuffer(1, 2)

	buf // res6: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2)

	3 +=: buf	// res7: buf.type = ListBuffer(3, 1, 2)

	buf.toList	// res8: List[Int] = List(3, 1, 2)
}
