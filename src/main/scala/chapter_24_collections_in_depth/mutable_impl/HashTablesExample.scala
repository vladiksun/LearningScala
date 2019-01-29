package chapter_24_collections_in_depth.mutable_impl

object HashTablesExample {

//    A hash table stores its elements in an underlying array, placing each item at a position in the array
//    determined by the hash code of that item. Adding an element to a hash table takes only constant time,
//    so long as there isn't already another element in the array that has the same hash code. Hash tables are
//    thus very fast so long as the objects placed in them have a good distribution of hash codes. As a result,
//    the default mutable map and set types in Scala are based on hash tables.

    val map = collection.mutable.HashMap.empty[Int,String]
    //  map: scala.collection.mutable.HashMap[Int,String] = Map()

    map += (1 -> "make a web site")
    //  res60: map.type = Map(1 -> make a web site)

    map += (3 -> "profit!")
    //  res61: map.type = Map(1 -> make a web site, 3 -> profit!)

    map(1)
    //  res62: String = make a web site

    map contains 2
    //  res63: Boolean = false
}
