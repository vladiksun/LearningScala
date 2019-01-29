package chapter_24_collections_in_depth.mutable_impl

object ArrayExample extends App {

    val a1 = Array(1, 2, 3)
    //  a1: Array[Int] = Array(1, 2, 3)

    val a2 = a1 map (_ * 3)
    //  a2: Array[Int] = Array(3, 6, 9)

    val a3 = a2 filter (_ % 2 != 0)
    //  a3: Array[Int] = Array(3, 9)

    a3.reverse
    //  res1: Array[Int] = Array(9, 3)

//    An array cannot pretend to be a sequence,
//    because the data type representation of a native array is not a subtype of Seq. Instead, whenever an
//    array would be used as a Seq, implicitly wrap it in a subclass of Seq. The name of that subclass
//    is scala.collection.mutable.WrappedArray. Here you see it in action:

    val seq: Seq[Int] = a1
    //  seq: Seq[Int] = WrappedArray(1, 2, 3)

    val a4: Array[Int] = seq.toArray
    //  a4: Array[Int] = Array(1, 2, 3)

    a1 eq a4
    //  res2: Boolean = true
}
