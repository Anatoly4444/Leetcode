class Solution {
fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    val map2 = mapOf(
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900,
    )
    var sum = 0
    var index = 0
    while(index < s.length) {
        val i1 = s[index]
        if((i1 == 'I' || i1 == 'X' || i1 == 'C') && index != s.lastIndex) {
            val i2 = s[index + 1]
            val key = String(charArrayOf(i1, i2))
            if(map2.contains(key)) {
                sum += map2[key]!!
                index = index.inc().inc()
            } else {
                sum += map[i1]!!
                index = index.inc()
            }
        } else {
            sum += map[i1]!!
            index = index.inc()
        }
    }
    return sum
}
}