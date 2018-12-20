package chapter_7_built_in_control_structures

object ForLoopYield4 extends App {

	var xs = List(1,2,3)
	var ys = List(1,2,3)

	//	for comprehension:
	val test1 = for ((x,y) <- xs zip ys) yield x*y

	//	same as destructuring bind
	val test2 = (xs zip ys) map { case (x,y) => x*y }

	println(test1)
	println(test2)
}
