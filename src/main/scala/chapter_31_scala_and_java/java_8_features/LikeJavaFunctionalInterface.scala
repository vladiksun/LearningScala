package chapter_31_scala_and_java.java_8_features

object LikeJavaFunctionalInterface {

	// trait with a single method
	trait Increaser {
		def increase(i: Int): Int
	}

	def increaseOne(increaser: Increaser): Int =
		increaser.increase(1)


	increaseOne(
		new Increaser {
			def increase(i: Int): Int = i + 7
		}
	)

	increaseOne(i => i + 7) // Scala 2.12
}
