package chapter_24_collections_in_depth

object Col_5_1_ViewsExample {

    val v = Vector(1 to 10: _*) // v: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    v map (_ + 1) map (_ * 2) // apply two map eagerly
//    res5: scala.collection.immutable.Vector[Int] = Vector(4, 6, 8, 10, 12, 14, 16, 18, 20, 22)

    // do it lazily. This is like writing a scenario. This avoids creating intermediate vectors
    (v.view map (_ + 1) map (_ * 2)).force
    // res12: Seq[Int] = Vector(4, 6, 8, 10, 12, 14, 16, 18, 20, 22)

    // make it sequentially to understand how it works
    val vv = v.view
    //  vv: scala.collection.SeqView[Int,Vector[Int]] = SeqView(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val res13 = vv map (_ + 1) // res13: scala.collection.SeqView[Int,Seq[_]] = SeqViewM(...)

    val res14 = res13 map (_ * 2) // res14: scala.collection.SeqView[Int,Seq[_]] = SeqViewMM(...)

    res14.force  // res15: Seq[Int] = Vector(4, 6, 8, 10, 12, 14, 16, 18, 20, 22)
}
