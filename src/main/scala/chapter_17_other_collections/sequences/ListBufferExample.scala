package chapter_17_other_collections.sequences

import scala.collection.mutable.ListBuffer

object ListBufferExample extends App {

	// ListBuffer is analog of java's ArrayList. It gives good performance on appending operation
	// Another reason to use ListBuffer instead of List is to prevent the potential for stack overflow.

	val buf = new ListBuffer[Int]
	buf += 1	// res4: buf.type = ListBuffer(1)
	buf += 2	// res5: buf.type = ListBuffer(1, 2)

	buf // res6: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2)

	3 +=: buf	// res7: buf.type = ListBuffer(3, 1, 2)

	buf.toList	// res8: List[Int] = List(3, 1, 2)
}
