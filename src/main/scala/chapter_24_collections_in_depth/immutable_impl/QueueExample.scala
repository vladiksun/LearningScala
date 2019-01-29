package chapter_24_collections_in_depth.immutable_impl

object QueueExample extends App {

    val empty = scala.collection.immutable.Queue[Int]()
    //  empty: scala.collection.immutable.Queue[Int] = Queue()

    val has1 = empty.enqueue(1)
    //  has1: scala.collection.immutable.Queue[Int] = Queue(1)

    val has123 = has1.enqueue(List(2, 3))
    //  has123: scala.collection.immutable.Queue[Int] = Queue(1, 2, 3)

    val (element, has23) = has123.dequeue
    //  element: Int = 1
    //  has23: scala.collection.immutable.Queue[Int] = Queue(2, 3)
}
