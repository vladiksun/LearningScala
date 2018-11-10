package chapter_4_classes_objects

object FallWinterSpringSummer extends App {

    for (season <- List("fall", "winter", "spring"))
        println(season + ": " + ChecksumAccumulator.calculate(season))
}
