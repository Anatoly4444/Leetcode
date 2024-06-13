class Solution {
    
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var j = 0
        nums.forEach{
            if(it != `val`) {
              nums.set(j, it)
              j++  
            }     
        }
        return j
    }
}