package chapter_17_other_collections.sets_maps

import scala.collection.mutable

object DefaultMapsExample extends App {

	val map = mutable.Map.empty[String, Int]

	map("hello") = 1
	map("there") = 2

	map("hello")		// res21: Int = 1

	def countWords(text: String) = {
		val counts = mutable.Map.empty[String, Int]
		for (rawWord <- text.split("[ ,!.]+")) {
			val word = rawWord.toLowerCase
			val oldCount =
				if (counts.contains(word)) counts(word)
				else 0
			counts += (word -> (oldCount + 1))
		}
		counts
	}

	// What it is													What it does

	val nums = Map("i" -> 1, "ii" -> 2)							// Creates an immutable map (nums.toString returnsMap(i -> 1, ii - > 2))
	nums + ("vi" -> 6) 											// Adds an entry (returns Map(i -> 1, ii -> 2, vi -> 6))
	nums - "ii" 												// Removes an entry (returns Map(i -> 1))
	nums ++ List("iii" -> 3, "v" -> 5) 							// Adds multiple entries (list of tuples) (returns Map(i -> 1, ii -> 2, iii -> 3, v -> 5))
	nums -- List("i", "ii") 									// Removes multiple entries (returns Map())
	nums.size 													// Returns the size of the map (returns 2)
	nums.keys 													// Returns the keys (returns an Iterable over the strings"i" and "ii")
	nums.keySet 												// Returns the keys as a set (returns Set(i, ii))
	nums.values 												// Returns the values (returns an Iterable over the integers 1 and 2)
	nums.isEmpty 												// Indicates whether the map is empty (returns false)

	val words =   												// Creates an empty, mutable map
		mutable.Map.empty[String, Int]
	words += ("one" -> 1) 										// Adds a map entry from "one" to 1 (words.toString returns Map(one - > 1))
	words -= "one" 												// Removes a map entry, if it exists (words.toString returns Map())
	words ++= List("one" -> 1, "two" -> 2, "three" -> 3)		// Adds multiple map entries (words.toString returnsMap(one - > 1, two -> 2, three -> 3))
	words --= List("one", "two") 								// Removes multiple objects (words.toString returnsMap(three -> 3))
}
