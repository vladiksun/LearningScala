package chapter_21_implicit_conversions_and_parameters.implicits_2_examples

import java.awt.Button
import java.awt.event.{ActionEvent, ActionListener}

object ImplicitConversionListenerExample extends App {

	val button = new Button

	button.addActionListener(
		new ActionListener {
			def actionPerformed(event: ActionEvent) = {
				println("pressed explicit!")
			}
		}
	)

	// hypothetical converter
	implicit def function2ActionListener(f: ActionEvent => Unit) =
		new ActionListener {
			def actionPerformed(event: ActionEvent) = f(event)
		}

	// implicit conversion from ActionListener to a function happens here
	button.addActionListener(
		(_: ActionEvent) => println("pressed implicit!")
	)

	button.dispatchEvent(new ActionEvent(button, ActionEvent.ACTION_FIRST, "Click event"))

}
