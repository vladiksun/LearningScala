package chapter_11_scala_hierarchy.htmlTypes

object TestHtml extends App {

	def title(text: Text, anchor: Anchor, style: Style): Html =
		new Html(
			s"<a id='${anchor.value}'>" +
					s"<h1 class='${style.value}'>" +
					text.value +
					"</h1></a>"
		)

}
