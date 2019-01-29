package chapter_24_collections_in_depth.mutable_impl

object QueueMutableExample extends App {

    val queue = new scala.collection.mutable.Queue[String]
    //  queue: scala.collection.mutable.Queue[String] = Queue()

    queue += "a"
    //  res47: queue.type = Queue(a)

    queue ++= List("b", "c")
    //  res48: queue.type = Queue(a, b, c)

    queue.dequeue
    //  res50: String = a

    queue
    //  res51: scala.collection.mutable.Queue[String] = Queue(b, c)
}
