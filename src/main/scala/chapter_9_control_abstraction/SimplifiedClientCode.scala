package chapter_9_control_abstraction

object SimplifiedClientCode {

	// wrong
	def containsNeg(nums: List[Int]): Boolean = {
		var exists = false
		for (num <- nums)
			if (num < 0)
				exists = true
		exists
	}

	// right
	def containsNeg2(nums: List[Int]) = nums.exists(_ < 0)

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// wrong
	def containsOdd(nums: List[Int]): Boolean = {
		var exists = false
		for (num <- nums)
			if (num % 2 == 1)
				exists = true
		exists
	}

	// right
	def containsOdd2(nums: List[Int]) = nums.exists(_ % 2 == 1)
}
