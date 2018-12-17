package chapter_20_abstract_members.abstract_9_enumirations

object EnumExample extends App {

	for (d <- Direction.values)
		println(d + " ")

	println(Direction.East.id)

	println(Direction(1))
}
