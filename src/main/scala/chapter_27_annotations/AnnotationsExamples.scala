package chapter_27_annotations

object AnnotationsExamples extends App {

	@deprecated("use newShinyMethod() instead")
	def bigMistake() = "This is a mistake"

	@volatile var shared = BigDecimal(10000)

	@SerialVersionUID(100L)
	class SerializableClass (val field1:String,
							 @transient val field2:String) extends Serializable {}
}
