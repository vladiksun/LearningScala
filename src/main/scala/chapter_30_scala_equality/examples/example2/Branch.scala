package chapter_30_scala_equality.examples.example2

class Branch[+T] (val elem: T, val left: Tree[T], val right: Tree[T]) extends Tree[T] {


	def canEqual(other: Any): Boolean = other.isInstanceOf[Branch[_]]

	// The type parameter t represents the unknown element type of the Branch
	//	It can also be replaced by an underscore, as in the following case, which is equivalent to
	//			the previous one:
	//	case that: Branch[_] =>
	override def equals(other: Any): Boolean = other match {
		case that: Branch[t] =>
			(that canEqual this) &&
					elem == that.elem &&
					left == that.left &&
					right == that.right
		case _ => false
	}

	override def hashCode(): Int = (elem, left, right).##
}


