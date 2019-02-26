package chapter_31_scala_and_java.java_8_features

import java.util
import java.util.function.IntUnaryOperator

object LikeJavaStream {

	val stream = util.Arrays.stream(Array(1, 2, 3))

	stream.map(
				new IntUnaryOperator {
					def applyAsInt(i: Int): Int = i + 1
				}
				).toArray

	stream.map(i => i + 1).toArray // Scala 2.12

	val f1 = (i: Int) => i + 1
	stream.map(i => f1(i)).toArray

	val f2: IntUnaryOperator = i => i + 1
	stream.map(f2).toArray


}
