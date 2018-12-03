package chapter_17_other_collections.sets_maps

import scala.collection.mutable

object DefaultSetsExample extends  App {

	val mutaSet = mutable.Set(1, 2, 3)

	val text = "See Spot run. Run, Spot. Run!"
	val wordsArray = text.split("[ !,.]+")

	val words = mutable.Set.empty[String] // Creates an empty, mutable set (words.toString returnsSet())

	for (word <- wordsArray)
		words += word.toLowerCase

	// What it is									What it does

	val nums = Set(1, 2, 3)				// Creates an immutable set (nums.toString returnsSet(1, 2, 3))
	nums + 5							// Adds an element (returns Set(1, 2, 3, 5))
	nums - 3							// Removes an element (returns Set(1, 2))
	nums ++ List(5, 6)					// Adds multiple elements (returns Set(1, 2, 3, 5, 6))
	nums -- List(1, 2) 					// Removes multiple elements (returns Set(3))
	nums & Set(1, 3, 5, 7) 				// Takes the intersection of two sets (returns Set(1, 3))
	nums.size 							// Returns the size of the set (returns 3)
	nums.contains(3) 					// Checks for inclusion (returns true)

	words += "the" 						// Adds an element (words.toString returns Set(the))
	words -= "the" 						// Removes an element, if it exists (words.toStringreturns Set())
	words ++= List("do", "re", "mi") 	// Adds multiple elements (words.toString returnsSet(do, re, mi))
	words --= List("do", "re") 			//Removes multiple elements (words.toString returnsSet(mi))
	words.clear 						//Removes all elements (words.toString returns Set())
}
