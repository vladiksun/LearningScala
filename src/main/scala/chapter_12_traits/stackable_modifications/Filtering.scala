package chapter_12_traits.stackable_modifications

trait Filtering extends IntQueue {

	abstract override def put(x: Int) = {
		if (x >= 0) super.put(x)
	}

}
