package chapter_24_collections_in_depth.mutable

object ArrayBufferExampleRevisited extends App {

//	You've already seen array buffers in Section 17.1. An array buffer holds an array and a size. Most
//	operations on an array buffer have the same speed as an array, because the operations simply access
//	and modify the underlying array. Additionally, array buffers can have data efficiently added to the end.
//	Appending an item to an array buffer takes amortized constant time. Thus, array buffers are useful for
//	efficiently building up a large collection whenever the new items are always added to the end.

	val buf = collection.mutable.ArrayBuffer.empty[Int]
	//	buf: scala.collection.mutable.ArrayBuffer[Int]= ArrayBuffer()

	buf += 1
	//	res38: buf.type = ArrayBuffer(1)

	buf += 10
	//	res39: buf.type = ArrayBuffer(1, 10)

	buf.toArray
	//	res40: Array[Int] = Array(1, 10)
}
