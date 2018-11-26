package chapter_14_tests.spec2

import org.specs2._
import org.specs2.specification.core.SpecStructure

//Specify your software using both text and Scala code

object HelloWorldSpec extends Specification {
	override def is: SpecStructure = s2"""
  	This is a specification for the 'Hello world' string

  	The 'Hello world' string should
    	contain 11 characters                             $e1
    	start with 'Hello'                                $e2
    	end with 'world'                                  $e3
                                                      """
	def e1 = "Hello world" must haveSize(11)
	def e2 = "Hello world" must startWith("Hello")
	def e3 = "Hello world" must endWith("world")
}
