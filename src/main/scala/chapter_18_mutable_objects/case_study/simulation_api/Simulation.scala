package chapter_18_mutable_objects.case_study.simulation_api

abstract class Simulation {
	type Action = () => Unit // like java Consumer but without params

	case class WorkItem(time: Int, action: Action)

	private var curtime = 0

	private var agenda: List[WorkItem] = List()

	def currentTime: Int = curtime

	private def insert(ag: List[WorkItem], item: WorkItem): List[WorkItem] = {
		if (ag.isEmpty || item.time < ag.head.time)
			item :: ag
		else
			ag.head :: insert(ag.tail, item)
	}

	def afterDelay(delay: Int)(block: => Unit): Unit = {
		val item = WorkItem(currentTime + delay, () => block)
		agenda = insert(agenda, item)
	}

	private def next() = {
		(agenda: @unchecked) match {
			case item :: rest =>
				agenda = rest
				curtime = item.time
				item.action()
		}
	}

	def run() = {
		afterDelay(0) {
			println("*** simulation started, time = " +
					currentTime + " ***")
		}
		while (!agenda.isEmpty) next()
	}
}
