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
    val iter = arr.iterator()
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
            if(i1 == 'I' && i2 == 'V') {
               sum += 4
               skipNext = true
            }
            else if(i1 == 'I' && i2 == 'X') {
               sum += 9
               skipNext = true
            }
            else if(i1 == 'X' && i2 == 'L') {
               sum += 40
               skipNext = true
            }
            else if(i1 == 'X' && i2 == 'C') {
               sum += 90
               skipNext = true
            }
            else if(i1 == 'C' && i2 == 'D') {
               sum += 400
               skipNext = true
            }
            else if(i1 == 'C' && i2 == 'M'){
               sum += 900
               skipNext = true
            } else 
                sum += map[i1]!!
        } else {
            sum += map[i1]!!
        }
    }
    return sum
}
}