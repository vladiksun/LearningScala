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
					mutable.MutableList
					List
					Stream
				mutable.Buffer
					mutable.ListBuffer
					mutable.ArrayBuffer
			Set
				SortedSet
					immutable.TreeSet
					mutable.TreeSet
				immutable.HashSet
				mutable.HashSet
				mutable.LinkedHashSet
				BitSet
				// EmptySet
				// Set1
				// Set2
				// Set3
				// Set4
			Map
				SortedMap
					immutable.TreeMap
					mutable.TreeMap
				mutable.HashMap
				mutable.LinkedHashMap
				immutable.HashMap
				// EmptyMap
				// Map1
				// Map2
				// Map3
				// Map4

}
