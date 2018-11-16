package chapter_12_traits.example_rectangular_object

trait Rectangular {
	def topLeft: Point
	def bottomRight: Point
	def left = topLeft.x
	def right = bottomRight.x
	def width = right - left
	// and many more geometric methods...
}
