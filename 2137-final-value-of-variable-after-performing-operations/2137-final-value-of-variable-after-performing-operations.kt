class Solution {
fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0
    for(i in operations) {
        when (i) {
            "--X", "X--" -> x--
            "++X", "X++" -> x++
        }
    }
    return x
}
}