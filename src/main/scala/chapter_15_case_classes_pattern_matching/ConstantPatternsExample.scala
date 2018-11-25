package chapter_15_case_classes_pattern_matching

object ConstantPatternsExample extends App {

    def describe(x: Any) = x match {
        case 5 => "five"
        case true => "truth"
        case "hello" => "hi!"
        case Nil => "the empty list"
        case _ => "something else"
    }

    println(describe(5))

}
