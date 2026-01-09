class AddTwoNumbers {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode headerSumList = new ListNode(0);
        ListNode dummyPointer = headerSumList;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            int onesDigit = sum % 10;
            carry = sum / 10;

            dummyPointer.next = new ListNode(onesDigit);
            dummyPointer = dummyPointer.next;
        }
        return headerSumList.next;
    }
}