package chapter_26_extractors.extr_4_sequence_patterns

import scala.collection.mutable.ArrayBuffer

object SequencePatternsExample extends App {

	Seq(1, 2 ,3) match {
		case List() => println("empty List")
		case List(x, y, _*) => println("more than two elements list")
		case ArrayBuffer(x, 0, 0, _) => println("array")
	}
}
