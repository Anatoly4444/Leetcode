/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val result = ListNode(0)
        var l1 = list1
        var l2 = list2
        var current = result
        while(l1 != null && l2 != null) {
            if(l1.`val` < l2.`val`) {
                current.next = l1
                l1 = l1.next
            } else {
                current.next = l2
                l2 = l2.next
            }
            current = current.next
        }

        if (l1 != null) current.next = l1
        if (l2 != null) current.next = l2

        return result.next
    }
}