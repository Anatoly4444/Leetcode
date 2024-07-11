class Solution {
    fun addDigits(num: Int): Int {
        var result = num
        while(result > 9) {
            result = result.toString().toCharArray().sumOf { it.digitToInt() }
        }
        return result
    }
}