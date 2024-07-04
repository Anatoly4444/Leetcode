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
            when {
                i1 == 'I' && (i2 == 'V' || i2 == 'X') ->  {
                    sum += map[i2]!! - 1
                    skipNext = true
                }
                i1 == 'X' && (i2 == 'L' || i2 == 'C') -> {
                    sum += map[i2]!! - 10
                    skipNext = true
                }
                i1 == 'C' && (i2 == 'D' || i2 == 'M') -> {
                    sum += map[i2]!! - 100
                    skipNext = true
                }
                else -> {
                    sum += map[i1]!!
                }
            }
        } else {
            sum += map[i1]!!
        }
    }
    return sum
}
}