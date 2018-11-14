package chapter_10_composition_and_inheritance

// make private
private final class UniformElement(ch: Char,
					 override val width: Int,
					 override val height: Int) extends Element {

	//gets called from a constructor
	private val line = ch.toString * width

	override def contents: Array[String] = Array.fill(height)(line)
}
