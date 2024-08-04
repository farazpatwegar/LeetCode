class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the start of the merged list
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        // Traverse both lists and merge them
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // If either list is not yet exhausted, append the remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // The merged list is pointed by dummy.next
        return dummy.next;
    }
}
