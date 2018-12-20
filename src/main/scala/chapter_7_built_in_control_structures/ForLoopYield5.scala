package chapter_7_built_in_control_structures

object ForLoopYield5 extends App {

	var xs = List(1,2,3)
	var ys = List(1,2,3)

	//	for comprehension:
	val test1 = for (x <- xs; y <- ys) yield x*y

	//	same as cross product
	val test2 = xs flatMap {x => ys map {y => x*y}}

	println(test1)
	println(test2)
}
