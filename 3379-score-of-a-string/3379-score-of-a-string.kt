class Solution {
fun scoreOfString(s: String): Int {
    var sum = 0
    for(i in 0..< s.lastIndex) {
        val i1 = s[i]
        val i2 = s[i + 1]
        sum += abs(i1.code - i2.code)
    }
    return sum
}
}