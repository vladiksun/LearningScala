package chapter_25_collections_architecture.RNA

abstract class Base extends Product with Serializable

case object A extends Base
case object T extends Base
case object G extends Base
case object U extends Base

object Base {
	val fromInt: Int => Base = Array(A, T, G, U)
	val toInt: Map[Base with Product with Serializable, Int] = Map(A -> 0, T -> 1, G -> 2, U -> 3)
}
