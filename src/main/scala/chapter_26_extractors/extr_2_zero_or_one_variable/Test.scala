package chapter_26_extractors.extr_2_zero_or_one_variable

import chapter_26_extractors.extr_1_email_example.EMail

object Test extends App {


	userTwiceUpper("DIDI@hotmail.com")
	//	res0: String = match: DI in domain hotmail.com

	userTwiceUpper("DIDO@hotmail.com")
	//	res1: String = no match

	userTwiceUpper("didi@hotmail.com")
	//	res2: String = no match


//	the form x @ UpperCase() associates the variable xwith the pattern matched
//	by UpperCase(). For instance, in the first userTwiceUpper invocation above, x was bound to "DI",
//	because that was the value against which the UpperCase() pattern was matched.
	def userTwiceUpper(s: String) = s match {
		case EMail(Twice(x @ UpperCase()), domain) =>
			"match: " + x + " in domain " + domain
		case _ =>
			"no match"
	}

}
