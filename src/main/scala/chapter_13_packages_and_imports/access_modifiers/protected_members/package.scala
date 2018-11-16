package chapter_13_packages_and_imports.access_modifiers

package object protected_members {

	class Super {
		protected def f() = { println("f") }
	}

	class Sub extends Super {
		f()
	}

	class Other {
		// error: f is not accessible
		//(new Super).f()
	}
}
