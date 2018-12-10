package chapter_18_mutable_objects

object ScalaPropertiesWithoutField extends App {

	class Thermometer {
		var celsius: Float = _ 	// assigns default value.

		// getter
		def fahrenheit = celsius * 9 / 5 + 32

		// setter
		def fahrenheit_=(f: Float) = {
			celsius = (f - 32) * 5 / 9
		}

		override def toString = fahrenheit + "F/" + celsius + "C"
	}


	val t = new Thermometer
	t.celsius = 100
	println(t)

	t.fahrenheit = -40
	println(t)


}
