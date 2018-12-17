package chapter_19_type_parameterization.upper_bounds

class PersonOrdered(val firstName: String, val lastName: String)
		extends Ordered[PersonOrdered] {

	def compare(that: PersonOrdered) = {
		val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
		if (lastNameComparison != 0)
			lastNameComparison
		else
			firstName.compareToIgnoreCase(that.firstName)
	}

	override def toString = firstName + " " + lastName
}
