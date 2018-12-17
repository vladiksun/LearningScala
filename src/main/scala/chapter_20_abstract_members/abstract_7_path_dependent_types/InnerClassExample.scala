package chapter_20_abstract_members.abstract_7_path_dependent_types

//	A path-dependent type resembles the syntax for an inner class type in Java, but there is a crucial
//	difference: a path-dependent type names an outer object, whereas an inner class type names an
//	outer class. Java-style inner class types can also be expressed in Scala, but they are written differently.
//	Consider these two classes, Outer and Inner:

class Outer {
	class Inner
}



object InnerClassExample extends App {

//	In Scala, the inner class is addressed using the expression Outer#Inner instead of Java'sOuter.Inner. The
//	`.' syntax is reserved for objects. For example, imagine you instantiate two objects of type Outer, like
//	this:
	val o1 = new Outer
	val o2 = new Outer

	val inner1 = new o1.Inner
	val inner2 = new o2.Inner

//	Here o1.Inner and o2.Inner are two path-dependent types (and they are different types).
	inner1 match {
		case _: o1.Inner => println("o1.Inner")
//		case _: o2.Inner => println("o2.Inner") // can't do that as this is a different type
		case _ 			 => println("Another")
	}

//	Both of these
//	types conform to (are subtypes of) the more general type Outer#Inner, which represents the Inner class
//	with an arbitrary outer object of type Outer. By contrast, type o1.Inner refers to the Inner class with
//	a specific outer object (the one referenced from o1). Likewise, type o2.Inner refers to the Inner class
//	with a different, specific outer object (the one referenced from o2).


}
