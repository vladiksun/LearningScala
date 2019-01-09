package chapter_24_collections_in_depth

object Col_3_Traversable_vs_Iterable {

	//	Now assume you want to make trees traversable. To do this, have Tree inherit fromTraversable[Int] and
	//	define a foreach method like this:

	//  foreach implementation without iterator
	sealed abstract class TreeTravesable extends Traversable[Int] {
		def foreach[U](f: Int => U) = this match {
			case NodeTravesable(elem) => f(elem)
			case BranchTravesable(left, right) => left foreach f; right foreach f
		}
	}

	case class BranchTravesable(left: TreeTravesable, right: TreeTravesable) extends TreeTravesable
	case class NodeTravesable(elem: Int) extends TreeTravesable


	// this is not efficient

//	At first glance, this looks no harder than the foreach solution. However, there's an efficiency problem
//	that has to do with the implementation of the iterator concatenation method, ++. Every time an element
//			is produced by a concatenated iterator such as l.iterator ++ r.iterator, the computation needs to follow
//	one indirection to get at the right iterator (either l.iterator, or r.iterator). Overall, that makes \log(N)
//	indirections to get at a leaf of a balanced tree with Nleaves. So the cost of visiting all elements of a tree
//			went up from about 2N for the foreachtraversal method to N \log(N) for the traversal with iterator. If
//	the tree has a million elements that means about two million steps for foreach and about twenty million
//	steps for iterator. So the foreach solution has a clear advantage.

	sealed abstract class TreeIterable extends Iterable[Int] {
		def iterator: Iterator[Int] = this match {
			case Node(elem) => Iterator.single(elem)
			case Branch(left, right) => left.iterator ++ right.iterator
		}
	}

	case class Branch(left: TreeIterable, right: TreeIterable) extends TreeIterable
	case class Node(elem: Int) extends TreeIterable
}
