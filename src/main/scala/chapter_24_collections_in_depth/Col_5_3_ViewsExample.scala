package chapter_24_collections_in_depth

object Col_5_3_ViewsExample extends App {

//    The second use case applies to views over mutable sequences. Many transformer functions on such
//    views provide a window into the original sequence that can then be used to update selectively some
//    elements of that sequence. To see this in an example, suppose you have an array arr:

    val arr = (0 to 9).toArray

//    You can create a subwindow into that array by creating a slice of a view of the array:
    val subarr = arr.view.slice(3, 6)

//    This gives a view, subarr, which refers to the elements at positions 3 through 5 of the array arr. The
//    view does not copy these elements, it just provides a reference to them.

    def negate(xs: collection.mutable.Seq[Int]) =
        for (i <- 0 until xs.length)
            xs(i) = -xs(i)

    negate(subarr) // res4: Array[Int] = Array(0, 1, 2, -3, -4, -5, 6, 7, 8, 9)
}
