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
    val set = mutableSetOf<Int>()
    fun deleteDuplicates(head: ListNode?): ListNode? {
        val zero = ListNode(0)
        var element = head
        var node = zero
        while(element != null) {
            val added = set.add(element.`val`)
            if(added) {
                node.next = element
                node = element
            } else {
                if(element.next == null) node.next = null
            }
            element = element.next
        }
        return zero.next
    }
}