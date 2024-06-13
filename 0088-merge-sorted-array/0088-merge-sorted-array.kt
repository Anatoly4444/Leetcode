class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
       var nums22 = nums2.take(n)
       var x = 0
       nums1.forEachIndexed{index, element -> 
        if(index >= m) 
            nums1.set(index, nums22[x++])
       }
       nums1.sort()
       nums1.forEach { print(it) }
    }
}