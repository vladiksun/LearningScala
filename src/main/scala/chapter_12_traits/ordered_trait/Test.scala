package chapter_12_traits.ordered_trait

object Test extends App {

	var half = new RationalOrdered(1, 2)
	var third = new RationalOrdered(1, 3)

	half < third
}
