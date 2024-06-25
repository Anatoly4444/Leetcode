class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val resultList = mutableListOf<String>()
        if (nums.isEmpty()) {
            return resultList
        }
        var i = 0
        while (i < nums.size) { 
            val numberStringBuilder = StringBuilder()
            numberStringBuilder.append(nums[i])

            val currentIndex = i

            while (i < nums.lastIndex && nums[i] + 1 == nums[i + 1]) {
                i++
            }

            if (currentIndex < i) {
                numberStringBuilder
                    .append("->")
                    .append(nums[i])
            }
            resultList.add(numberStringBuilder.toString())

            i++
        }
        return resultList
    }
}