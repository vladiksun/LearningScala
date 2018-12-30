package chapter_23_for_expressions_revisited

object ForExpr_7_GeneralizingFor {

	abstract class C[A] {
		def map[B](f: A => B): C[B]
		def flatMap[B](f: A => C[B]): C[B]
		def withFilter(p: A => Boolean): C[A]
		def foreach(b: A => Unit): Unit
	}
}
