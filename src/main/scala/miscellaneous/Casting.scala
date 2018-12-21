package miscellaneous

object Casting extends App {

	def castToString(x: Any) =  {
		if (x.isInstanceOf[String]) {
			val s = x.asInstanceOf[String]
			s.length
		} else {
			x.toString
		}
	}

	def castToStringViaPatternMatch(x: Any) =  {
		x match {
			case s: String =>
				s.length
			case _ =>
				x.toString
		}
	}


}
