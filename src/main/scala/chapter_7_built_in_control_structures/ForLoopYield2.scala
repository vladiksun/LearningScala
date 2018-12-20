package chapter_7_built_in_control_structures

object ForLoopYield2 extends App {

    private val opGroups = Array(
		Set("1", "2"),
		Set("3", "4"),
	)

	private val countMap = {
        val assocs =
            for {
                i <- opGroups.indices // generator 1
                op <- opGroups(i)     // generator 2
            } yield op -> i
        assocs.toMap
    }
}
