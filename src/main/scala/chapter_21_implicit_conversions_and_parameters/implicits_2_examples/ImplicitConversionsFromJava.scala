package chapter_21_implicit_conversions_and_parameters.implicits_2_examples

import scala.collection.JavaConverters._
import scala.collection.mutable

object ImplicitConversionsFromJava {

	val sm = Map[String, String]("a" -> "b", "c" -> "d")
	val jm: java.util.Map[String, String] = sm.asJava

	val sm2: mutable.Map[String, String] = jm.asScala
	assert(sm == sm2)
}
