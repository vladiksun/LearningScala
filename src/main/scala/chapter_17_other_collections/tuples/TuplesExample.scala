package chapter_17_other_collections.tuples

object TuplesExample extends App {

	def longestWord(words: Array[String]): (String, Int) = {
		var word = words(0)
		var idx = 0
		for (i <- 1 until words.length)
			if (words(i).length > word.length) {
				word = words(i)
				idx = i
			}
		(word, idx)
	}

	val longest = longestWord("The quick brown fox".split(" "))

	longest._1
	longest._2

	val (word, idx) = longest
	println(word)
	println(idx)


}
