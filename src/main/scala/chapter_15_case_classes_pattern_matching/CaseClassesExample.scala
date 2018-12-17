package chapter_15_case_classes_pattern_matching

import chapter_15_case_classes_pattern_matching.model._

object CaseClassesExample extends App {

//    First, it adds a factory method with the name of the class. This means that, for instance, you can
//    write Var("x") to construct a Var object, instead of the slightly longer new Var("x")
//    for case classes no need to use the NEW keyword
    val v = Var("x")

    val op = BinOp("+", Number(1), v)


//    The second syntactic convenience is that all arguments in the parameter list of a case class implicitly
//    get a val prefix, so they are maintained as fields
    v.name
    op.left

//    Third, the compiler adds "natural" implementations of methods toString, hashCode, and equals to your
//    class

    println(op)
    println(op.right == Var("x"))

//    Finally, the compiler adds a copy method to your class for making modified copies
    op.copy(operator = "-")


}
