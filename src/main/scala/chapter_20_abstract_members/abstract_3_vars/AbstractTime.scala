package chapter_20_abstract_members.abstract_3_vars

//	If you declare an abstract var named hour, for example, you implicitly declare an abstract getter
//	method, hour, and an abstract setter method, hour_=.

trait AbstractTime {
	var hour: Int
	var minute: Int
}

// The compiler will do this
trait AbstractTimeAfterCompile {
	def hour: Int // getter for `hour'
	def hour_=(x: Int) // setter for `hour'
	def minute: Int // getter for `minute'
	def minute_=(x: Int) // setter for `minute'
}