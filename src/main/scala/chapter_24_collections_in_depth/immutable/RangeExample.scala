package chapter_24_collections_in_depth.immutable

object RangeExample extends App {

    1 to 3
    //  res31: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3)

    5 to 14 by 3
    //  res32: scala.collection.immutable.Range = Range(5, 8, 11, 14)

    1 until 3
    //  res33: scala.collection.immutable.Range = Range(1, 2)
}
