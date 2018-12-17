package chapter_20_abstract_members.abstract_10_case_study

object TestCurrency extends App {

	val yen = Japan.Yen from US.Dollar * 100

	val euro = Europe.Euro from yen

	val dollar = US.Dollar from euro
}
