package chapter_18_mutable_objects

//In Scala, every var that is a non-private member of some object implicitly defines a getter and a setter
//method with it. These getters and setters are named differently from the Java convention, however. The
//getter of a var x is just named "x", while its setter is named "x_=".
object ScalaProperties extends App {

	class Time {
		var hour = 12
		var minute = 0
	}

	val time = new Time
	println(time.hour) // call getter

	time.hour = 13	// setter call

// under the hood this implementation is exactly equivalent to the class definition
// The compiler will do this
	class TimeAfterCompile {
		private[this] var h = 12
		private[this] var m = 0

		def hour: Int = h
		def hour_=(x: Int): Unit = { h = x }

		def minute: Int = m
		def minute_=(x: Int): Unit = { m = x }
	}

	// we can alter setter
	class Time3 {
		private[this] var h = 12
		private[this] var m = 0

		def hour: Int = h
		def hour_= (x: Int): Unit = {
			require(0 <= x && x < 24)
			h = x
		}

		def minute: Int = m
		def minute_= (x: Int): Unit = {
			require(0 <= x && x < 60)
			m = x
		}
	}
}
