/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            counter++;
        }
        counter = counter/2;
        curr = head;
        while(counter-- != 0){
            curr = curr.next;
        }
        return curr;
    }
}
