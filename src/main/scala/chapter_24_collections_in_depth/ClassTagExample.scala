package chapter_24_collections_in_depth

object ClassTagExample extends App {

    // This works
    import scala.reflect.ClassTag
    def evenElems[T: ClassTag](xs: Vector[T]): Array[T] = {
        val arr = new Array[T]((xs.length + 1) / 2)
        for (i <- 0 until xs.length by 2)
            arr(i / 2) = xs(i)
        arr
    }


    evenElems(Vector(1, 2, 3, 4, 5))

    evenElems(Vector("this", "is", "a", "test", "run"))

}
