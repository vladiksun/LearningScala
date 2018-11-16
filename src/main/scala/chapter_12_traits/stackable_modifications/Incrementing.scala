package chapter_12_traits.stackable_modifications

trait Incrementing extends IntQueue {

	abstract override def put(x: Int) = { super.put(x + 1) }

}
