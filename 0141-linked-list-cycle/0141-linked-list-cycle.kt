/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution { //Tortoise and Hare algorithm
    fun hasCycle(head: ListNode?): Boolean {
        var hare = head
        var turtle = head
        while(hare?.next != null) {
            turtle = turtle?.next
            hare = hare.next?.next
            if(turtle === hare)
                return true
        }
        return false
    }
}