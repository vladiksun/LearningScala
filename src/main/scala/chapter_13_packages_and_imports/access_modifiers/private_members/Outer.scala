package chapter_13_packages_and_imports.access_modifiers.private_members

class Outer {

	class Inner {
		private def f() = { println("f") }

		class InnerMost {
			f() // OK
		}
	}

	// error: f is not accessible
	//(new Inner).f()
}
