package chapter_21_implicit_conversions_and_parameters.implicits_5_implicit_parameters

object Example3_ContextBound extends App {

	def maxList1[T](elements: List[T])
				  (implicit ordering: Ordering[T]): T =
		elements match {
			case List() =>
				throw new IllegalArgumentException("empty list!")
			case List(x) => x
			case x :: rest =>
				val maxRest = maxList1(rest) 	// (ordering) is implicit
				if (ordering.gt(x, maxRest)) x 	// this ordering is still explicit
				else maxRest
		}

	val max = maxList1(List(1,5,10,3))
	println(max)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	def maxList2[T](elements: List[T])
				  (implicit comparator: Ordering[T]): T =
		elements match {
			case List() =>
				throw new IllegalArgumentException("empty list!")
			case List(x) => x
			case x :: rest =>
				val maxRest = maxList2(rest)
				if (implicitly[Ordering[T]].gt(x, maxRest)) x
				else maxRest
		}

	val max2 = maxList2(List(1,5,10,3))
	println(max2)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// use context bound
	def maxList[T : Ordering](elements: List[T]): T =
		elements match {
			case List() =>
				throw new IllegalArgumentException("empty list!")
			case List(x) => x
			case x :: rest =>
				val maxRest = maxList(rest)
				if (implicitly[Ordering[T]].gt(x, maxRest)) x
				else maxRest
		}

	class NotOrdered(val x:Int)
	maxList(List(new NotOrdered(1), new NotOrdered(2)))((x: NotOrdered, y: NotOrdered) => 1)
}
