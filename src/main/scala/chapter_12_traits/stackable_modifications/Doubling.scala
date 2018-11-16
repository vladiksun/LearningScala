package chapter_12_traits.stackable_modifications

trait Doubling extends IntQueue {

//	Since super calls in a trait are dynamically bound, the super call in
//	trait Doubling will work so long as the trait is mixed in after another trait or class that gives a concrete
//			definition to the method.
	abstract override def put(x: Int): Unit = { super.put(2 * x) }

}
