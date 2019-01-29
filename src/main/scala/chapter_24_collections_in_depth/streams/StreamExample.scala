package chapter_24_collections_in_depth.streams

object StreamExample extends App {

    val str = 1 #:: 2 #:: 3 #:: Stream.empty    //  str: scala.collection.immutable.Stream[Int] = Stream(1, ?)

//    Below is a more complex example. It computes a stream that contains a Fibonacci sequence starting
//    with the given two numbers. A Fibonacci sequence is one where each element is the sum of the
//    previous two elements in the series:

    def fibFrom(a: Int, b: Int): Stream[Int] =
        a #:: fibFrom(b, a + b)

    val fibs = fibFrom(1, 1).take(7)

    fibs.toList
    //  res23: List[Int] = List(1, 1, 2, 3, 5, 8, 13)
}
