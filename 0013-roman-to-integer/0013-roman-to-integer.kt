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
    val arr = s.toCharArray()
    var sum = 0
    var skipNext = false
    for(x in arr.indices) {
        if(skipNext) {
            skipNext = false
            continue
        }
        val i1 = arr[x]
        if(x != arr.lastIndex) {
            val i2 = arr[x + 1]
            val key = String(charArrayOf(i1, i2))
            if(map2.contains(key)) {
                sum += map2[key]!!
                skipNext = true
            } else {
                sum += map[i1]!!
            }
        } else {
            sum += map[i1]!!
        }
    }
    return sum
}
}