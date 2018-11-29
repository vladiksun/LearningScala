package chapter_16_lists.first_order_methods

object Zip extends App {

	val abcde = List('a', 'b', 'c', 'd', 'e')

	val zipResult = abcde.indices zip abcde
	println(zipResult)  // Vector((0,a), (1,b), (2,c), (3,d), (4,e))

	val zippedDifferentLength = abcde zip List(1, 2, 3)
	println(zippedDifferentLength) // List((a,1), (b,2), (c,3))

	val zipWithIndex = abcde.zipWithIndex
	println(zipWithIndex) // List((a,0), (b,1), (c,2), (d,3), (e,4))

	val unzipped = zippedDifferentLength.unzip
	println(unzipped) // (List(a, b, c),List(1, 2, 3))
}
