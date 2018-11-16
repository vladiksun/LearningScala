package bobsrockets

package navigation {

	// access within outer package
	private[bobsrockets] class Navigator {

		// same as package visibility in Java
		protected[navigation] def useStarChart() = {}

		class LegOfJourney {
			// same as private in Java
			private[Navigator] val distance = 100
		}

		//access only from same object
		private[this] var speed = 200
	}
}

package launch {
	import navigation._

	object Vehicle {
		private[launch] val guide = new Navigator
	}
}
