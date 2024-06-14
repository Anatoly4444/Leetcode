class Solution {
    fun search(nums: IntArray, target: Int): Int {
        nums.forEachIndexed{i,v ->
            if(v == target)
                return i 
        }
        return -1
    }
}