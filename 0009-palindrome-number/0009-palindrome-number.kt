class Solution {
    fun isPalindrome(x: Int): Boolean {
        val y = x.toString()
        return y.reversed() == y
    }
}