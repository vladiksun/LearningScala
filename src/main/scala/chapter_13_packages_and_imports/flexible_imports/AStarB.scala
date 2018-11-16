package chapter_13_packages_and_imports.flexible_imports

import java.util.regex

class AStarB {
	// Accesses java.util.regex.Pattern
	val pat = regex.Pattern.compile("a*b")
}
