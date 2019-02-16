package chapter_30_scala_equality.examples

class ColoredPoint(x: Int, y: Int, val color: Color.Value) extends Point(x, y) { // Problem: equals not symmetric

    override def hashCode = (super.hashCode, color).##

    override def equals(other: Any) = other match {
        case that: ColoredPoint =>
            (that canEqual this) &&
                    super.equals(that) && this.color == that.color
        case _ =>
            false
    }
    
    override def canEqual(other: Any) =
        other.isInstanceOf[ColoredPoint]
}