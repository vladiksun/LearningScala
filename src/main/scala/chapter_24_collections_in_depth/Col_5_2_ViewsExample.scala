package chapter_24_collections_in_depth

object Col_5_2_ViewsExample extends App {

    val words = Seq("str1", "str2")

    def isPalindrome(x: String) = x == x.reverse
    def findPalindrome(s: Seq[String]) = s find isPalindrome

    findPalindrome(words take 1000000)

//    This nicely separates the two aspects of taking the first million words of a sequence and finding a
//            palindrome in it. But the downside is that it always constructs an intermediary sequence consisting of
//    one million words, even if the first word of that sequence is already a palindrome. So potentially,
//    999,999 words are copied into the intermediary result without being inspected at all afterwards. Many
//    programmers would give up here and write their own specialized version of finding palindromes in
//    some given prefix of an argument sequence. But with views, you don't have to. Simply write:

    findPalindrome(words.view take 1000000)

//    This has the same nice separation of concerns, but instead of a sequence of a million elements it will
//    only construct a single lightweight view object. This way, you do not need to choose between
//    performance and modularity.
}
