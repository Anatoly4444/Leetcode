class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for(i in (digits.size - 1) downTo 0){
            if(digits[i] < 9) {
                digits[i] += 1
                return digits
            } else digits[i] = 0
        }
        return IntArray(digits.size + 1){
                i -> if(i == 0) 1 else 0
        }
    }
}