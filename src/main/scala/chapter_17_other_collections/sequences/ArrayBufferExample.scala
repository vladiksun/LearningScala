package chapter_17_other_collections.sequences

import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample extends App {

//	An ArrayBuffer is like an array, except that you can additionally add and remove elements from the
//	beginning and end of the sequence. All Array operations are available, though they are a little slower
//	due to a layer of wrapping in the implementation. The new addition and removal operations are
//	constant time on average, but occasionally require linear time due to the implementation needing to
//	allocate a new array to hold the buffer's contents.

//	You've already seen array buffers in Section 17.1. An array buffer holds an array and a size. Most
//	operations on an array buffer have the same speed as an array, because the operations simply access
//	and modify the underlying array. Additionally, array buffers can have data efficiently added to the end.
//	Appending an item to an array buffer takes amortized constant time. Thus, array buffers are useful for
//	efficiently building up a large collection whenever the new items are always added to the end.

//	When you create an ArrayBuffer, you must specify a type parameter, but you don't need to specify a
//	length. The ArrayBuffer will adjust the allocated space automatically as needed:

	val buf = new ArrayBuffer[Int]()

	buf += 12	// res9: buf.type = ArrayBuffer(12)
	buf += 15	// res10: buf.type = ArrayBuffer(12, 15)

	buf	// res11: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(12, 15)

	buf.length // res12: Int = 2
	buf(0)	// res13: Int = 12

	buf.remove(0)
	println(buf)
}
