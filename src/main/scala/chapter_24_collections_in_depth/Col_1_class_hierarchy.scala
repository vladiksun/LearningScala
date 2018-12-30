package chapter_24_collections_in_depth

import scala.collection._

object Col_1_class_hierarchy {

	Traversable
		Iterable
			Seq
				IndexedSeq
					Vector
					mutable.ResizableArray
					// GenericArray
				scala.collection.LinearSeq
					mutable.MutableList
					List
					Stream
				mutable.Buffer
					mutable.ListBuffer
					mutable.ArrayBuffer
			Set
				SortedSet
					immutable.TreeSet
					immutable.TreeSet
				mutable.HashSet
				mutable.LinkedHashSet
				immutable.HashSet
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
