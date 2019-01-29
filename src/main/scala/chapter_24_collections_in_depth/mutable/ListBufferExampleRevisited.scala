package chapter_24_collections_in_depth.mutable

import scala.collection.mutable.ListBuffer

object ListBufferExampleRevisited extends App {

	// ListBuffer is analog of java's ArrayList. It gives good performance on appending operation
	// Another reason to use ListBuffer instead of List is to prevent the potential for stack overflow.

//	You've also already seen list buffers in Section 17.1. A list buffer is like an array buffer except that it
//	uses a linked list internally instead of an array. If you plan to convert the buffer to a list once it is built
//	up, use a list buffer instead of an array buffer

	val buf = collection.mutable.ListBuffer.empty[Int]
	//	buf: scala.collection.mutable.ListBuffer[Int] = ListBuffer()

	buf += 1
	//	res41: buf.type = ListBuffer(1)

	buf += 10
	//	res42: buf.type = ListBuffer(1, 10)

	buf.toList
	//	res43: List[Int] = List(1, 10)
}
