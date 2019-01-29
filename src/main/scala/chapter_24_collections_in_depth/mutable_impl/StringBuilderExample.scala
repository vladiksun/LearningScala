package chapter_24_collections_in_depth.mutable_impl

object StringBuilderExample extends App {

    val buf = new StringBuilder

    buf += 'a'
    //  res44: buf.type = a

    buf ++= "bcdef"
    //  res45: buf.type = abcdef

    buf.toString
    //  res46: String = abcdef
}
