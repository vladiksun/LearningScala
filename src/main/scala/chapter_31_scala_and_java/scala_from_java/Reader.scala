package chapter_31_scala_and_java.scala_from_java

import java.io._

class Reader {

	class Reader(fname: String) {

		private val in = new BufferedReader(new FileReader(fname))

		@throws(classOf[IOException])
		def read() = in.read()
	}
}
