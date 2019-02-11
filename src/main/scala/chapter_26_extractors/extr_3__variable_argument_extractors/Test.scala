package chapter_26_extractors.extr_3__variable_argument_extractors

import chapter_26_extractors.extr_1_email_example.EMail

object Test extends App {

	"acm.org" match {
		case Domain("org", "acm") => println("acm.org")
		case Domain("com", "sun", "java") => println("java.sun.com")
		case Domain("net", _*) => println("a .net domain")
	}


	def isTomInDotCom(s: String): Boolean = s match {
		case EMail("tom", Domain("com", _*)) => true
		case _ => false
	}

	isTomInDotCom("tom@sun.com")
	//	res3: Boolean = true

	isTomInDotCom("peter@sun.com")
	//	res4: Boolean = false

	isTomInDotCom("tom@acm.org")
	//	res5: Boolean = false


	val s = "tom@support.epfl.ch"

	val ExpandedEMail(name, topdom, subdoms @ _*) = s
//	name: String = tom
//	topdom: String = ch
//	subdoms: Seq[String] = WrappedArray(epfl, support)
}
