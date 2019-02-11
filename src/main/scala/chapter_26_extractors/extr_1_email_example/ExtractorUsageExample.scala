package chapter_26_extractors.extr_1_email_example

object ExtractorUsageExample extends App {

	assert(   EMail.unapply("John@epfl.ch") equals Some("John", "epfl.ch")   )

	assert(   EMail.unapply("John Doe") equals None   )

	val x: Any = "John@epfl.ch"
	x match {
		case EMail(user, domain) => print(user)
	}

}
