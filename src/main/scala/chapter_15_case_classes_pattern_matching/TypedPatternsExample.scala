package chapter_15_case_classes_pattern_matching

object TypedPatternsExample extends App {

	def generalSize(x: Any) = x match {
		case s: String => s.length
		case m: Map[_, _] => m.size
		case _ => -1
	}

	generalSize("abc") // res16: Int = 3

	generalSize(Map(1 -> 'a', 2 -> 'b')) // res17: Int = 2

	generalSize(math.Pi) //res18: Int = -1


	// not correct usage as types are not known at runtime
	def isIntIntMapWrong(x: Any) = x match {
		case m: Map[Int, Int] => true
		case _ => false
	}

	println(isIntIntMapWrong(Map(1 -> 1)))         // res19: Boolean = true
	println(isIntIntMapWrong(Map("abc" -> "abc"))) // res20: Boolean = true

//  but erasure works for arrays because they are handled specially in java
//	The element type of an array is stored with the array value, so you can pattern match on it.
	def isStringArray(x: Any) = x match {
		case a: Array[String] => "yes"
		case _ => "no"
	}

	val as = Array("abc")
	println( isStringArray(as) )

}
