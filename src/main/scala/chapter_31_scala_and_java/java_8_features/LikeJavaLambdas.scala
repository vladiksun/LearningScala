package chapter_31_scala_and_java.java_8_features

import javax.swing.JButton

object LikeJavaLambdas {

	val button = new JButton

	// function literal instead of java lambda
	// Under the hood the implicit conversion takes |||| place ActionEvent => Unit function type to ActionListener.
	button.addActionListener(
		_ => println("pressed!")
	)
}
