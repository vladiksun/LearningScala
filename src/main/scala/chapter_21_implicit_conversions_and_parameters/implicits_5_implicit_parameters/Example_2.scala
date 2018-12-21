package chapter_21_implicit_conversions_and_parameters.implicits_5_implicit_parameters

object Example_2 extends App {

	def maxListOrdering[T](elements: List[T])
						  (ordering: Ordering[T]): T =
		elements match {
			case List() =>
				throw new IllegalArgumentException("empty list!")
			case List(x) => x
			case x :: rest =>
				val maxRest = maxListOrdering(rest)(ordering)
				if (ordering.gt(x, maxRest)) x
				else maxRest
		}

	// with implicit parameter
	def maxListImpParm[T](elements: List[T])
						 (implicit ordering: Ordering[T]): T =
		elements match {
			case List() =>
				throw new IllegalArgumentException("empty list!")
			case List(x) => x
			case x :: rest =>
				val maxRest = maxListImpParm(rest)(ordering)
				if (ordering.gt(x, maxRest)) x
				else maxRest
		}

	// implicit ordering is applied automatically because compiler can figure out that T is implements Ordering
	maxListImpParm(List(1,5,10,3))
	maxListImpParm(List(1.5, 5.2, 10.7, 3.14159))
	maxListImpParm(List("one", "two", "three"))

	// but for new not Ordering type we must provide it
	class NotOrdered(val x:Int)

	// will not compile
//	maxListImpParm(List(new NotOrdered(1), new NotOrdered(2)))
	maxListImpParm(List(new NotOrdered(1), new NotOrdered(2)))((x: NotOrdered, y: NotOrdered) => 1)
}
