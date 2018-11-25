package chapter_15_case_classes_pattern_matching

object VariablePatternsExamples extends App {

    def describe(x: Any) = x match {
        case 0 => "zero"
        case somethingElse => "not zero: " + somethingElse
    }

    println(describe(5))

}
