package chapter_24_collections_in_depth

import scala.collection._

object Col_1_class_hierarchy {

	Traversable
		Iterable
			Seq
				IndexedSeq	//	has efficient apply, length, and (if mutable) update operations
					Vector
					mutable.ResizableArray
					mutable.ArrayBuffer
					// GenericArray
				scala.collection.LinearSeq	//	A linear sequence has efficient head and tail operations
					mutable.MutableList	//	A MutableList consists of a single linked list together with a pointer that refers to the terminal empty node of that list.
						mutable.Queue
					List
					Stream
				mutable.Buffer
					mutable.ListBuffer //	uses a linked list internally instead of an array
					mutable.ArrayBuffer
			Set
				SortedSet
					immutable.TreeSet // Red-black trees
					mutable.TreeSet
				immutable.HashSet // Hash tries
				mutable.HashSet // based on hash tables
				mutable.LinkedHashSet
				BitSet
				// EmptySet
				// Set1
				// Set2
				// Set3
				// Set4
			Map
				SortedMap
					immutable.TreeMap // Red-black trees
					mutable.TreeMap
				mutable.HashMap // based on hash tables
				mutable.LinkedHashMap
				immutable.HashMap // Hash tries
				// EmptyMap
				// Map1
				// Map2
				// Map3
				// Map4
				immutable.ListMap // represents a map as a linked list of key-value pairs

}
