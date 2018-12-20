package chapter_7_built_in_control_structures

object ForLoopYield3 extends App {

	var xs = List(1,2,3)

	//	for comprehension:
	val test1 = for (x <- xs if x%2 == 0) yield x*10

	//	same as filter/map
	val test2 = xs.filter(_%2 == 0).map(_*10)

	println(test1)
	println(test2)
}
