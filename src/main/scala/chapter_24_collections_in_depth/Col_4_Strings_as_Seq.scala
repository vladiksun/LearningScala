package chapter_24_collections_in_depth

object Col_4_Strings_as_Seq extends App {

    val str = "hello"

    str.reverse
    str.map(_.toUpper)
    str drop 3
    str slice (1, 4)

    val s: Seq[Char] = str // s: Seq[Char] = WrappedString(h, e, l, l, o)
}
