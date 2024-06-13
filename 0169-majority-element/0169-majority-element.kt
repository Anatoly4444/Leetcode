class Solution {
    fun majorityElement(nums: IntArray): Int {
        val d = nums.distinct()
        var majorCounter = 0
        var major = 0
        d.forEach{ x ->
            var counter = 0
            nums.forEach{y -> if(x == y) 
                counter++
            }
            if(counter > majorCounter) {
                majorCounter = counter
                major = x
            }
        }
        return major
    }
}