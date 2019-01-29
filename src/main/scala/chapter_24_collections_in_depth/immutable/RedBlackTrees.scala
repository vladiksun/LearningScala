package chapter_24_collections_in_depth.immutable

object RedBlackTrees extends App {

    val set = collection.immutable.TreeSet.empty[Int]
    //  set: scala.collection.immutable.TreeSet[Int] = TreeSet()

    set + 1 + 3 + 3
    //  res34: scala.collection.immutable.TreeSet[Int] = TreeSet(1, 3)
}
