package chapter_26_extractors.extr_4_sequence_patterns

object SequencePatternsExample extends App {

	Array(1, 2 ,3) match {
		case List() => println("empty List")
		case List(x, y, _*) => println("more than two elements list")
		case Array(x, 0, 0, _) => println("array")
	}
}
