ListNode* insertGreatestCommonDivisors(ListNode* head) {
    ListNode* first = head;
    ListNode* second = head->next;

    while (second != nullptr) {
        auto value = gcd(first->val, second->val);

        first->next = new ListNode(value, second);
        first = second;
        second = second->next;
    }

    return head;
}