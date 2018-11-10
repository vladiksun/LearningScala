
args.foreach(arg => println(arg))
args.foreach((arg: String) => println(arg))
args.foreach(println)


def testForEach(first: String, second: Int){
    println(first + " " + second)
}

var map = Map[String, Int]("one" -> 1, "two" -> 2)
var map2 = Map[String, Int]("one" -> 1, "two" -> 2)

map.foreach(mapEntry => testForEach(mapEntry._1, mapEntry._2))

for (arg <- args)
    print(arg)
