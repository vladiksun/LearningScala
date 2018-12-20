package chapter_13_packages_and_imports.imports

object ImportsExamples {

	import scala.collection._ 				//	wildcard import.

	import scala.collection.Map 			//	selective import.

	import scala.collection.{Map => MyMap} 	// renaming import.

	import java.util.{Date => _, _} 		//	import all from java.util except Date.
}
