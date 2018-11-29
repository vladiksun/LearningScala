package chapter_17_other_collections.sequences

object ImmutableLinkedListsByDefault extends App {

//	Perhaps the most important sequence type to know about is class List, the immutable linked-list
//	described in detail in the previous chapter. Lists support fast addition and removal of items to the
//			beginning of the list, but they do not provide fast access to arbitrary indexes because
//			the implementation must iterate through the list linearly.
//	This combination of features might sound odd, but they hit a sweet spot that works well for many
//	algorithms. The fast addition and removal of initial elements means that pattern matching works well

	val colors = List("red", "blue", "green")


}
