package chapter_18_mutable_objects.case_study.simulation_api

object RunSimulation extends App {

	object MySimulation extends CircuitSimulation {
		// method constants
		override def InverterDelay: Int = 1
		override def AndGateDelay: Int = 3
		override def OrGateDelay: Int = 5
	}

	val input1, input2, sum, carry = new MySimulation.Wire

	MySimulation.probe("sum", sum)
	MySimulation.probe("carry", carry)

	MySimulation.halfAdder(input1, input2, sum, carry)
	input1 setSignal true

	MySimulation.run()

	input2 setSignal true

	MySimulation.run()

}
