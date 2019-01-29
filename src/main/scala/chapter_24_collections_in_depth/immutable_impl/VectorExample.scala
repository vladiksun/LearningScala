package chapter_24_collections_in_depth.immutable_impl

object VectorExample extends App {

//    Vectors are a collection type that give efficient access to elements beyond the head. Access to any
//    elements of a vector take only "effectively constant time," as defined below. It's a larger constant than
//    for access to the head of a list or for reading an element of an array, but it's a constant nonetheless. As a
//    result, algorithms using vectors do not have to be careful about accessing just the head of the sequence.
//    They can access and modify elements at arbitrary locations, and thus they can be much more
//    convenient to write.

    val vec = scala.collection.immutable.Vector.empty
    //  vec: scala.collection.immutable.Vector[Nothing] = Vector()

    val vec2 = vec :+ 1 :+ 2
    //  vec2: scala.collection.immutable.Vector[Int] = Vector(1, 2)

    val vec3 = 100 +: vec2
    //  vec3: scala.collection.immutable.Vector[Int] = Vector(100, 1, 2)

//    Vectors are immutable, so you cannot change an element of a vector in place. However, with
//    the updated method you can create a new vector that differs from a given vector only in a single
//    element:

    vec updated (2, 4)
    //  res25: scala.collection.immutable.Vector[Int] = Vector(1, 2, 4)
}
