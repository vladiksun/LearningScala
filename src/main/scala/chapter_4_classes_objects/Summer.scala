package chapter_4_classes_objects

object Summer {

    def main(args: Array[String]): Unit = {
        for (arg <- args)
            println(arg + ": " + ChecksumAccumulator.calculate(arg))
    }
}
