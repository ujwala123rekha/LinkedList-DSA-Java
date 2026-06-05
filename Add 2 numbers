public Node addTwoNumbers(Node head1, Node head2) {
    Node dummyNode = new Node(-1);
    Node curr = dummyNode; 
    Node temp1 = head1;
    Node temp2 = head2;
    int carry = 0;
    
    while (temp1 != null || temp2 != null) {
        int sum = carry;
        
        if (temp1 != null) { 
            sum += temp1.data;
            temp1 = temp1.next; 
        }
        
        if (temp2 != null) {
            sum += temp2.data;
            temp2 = temp2.next;
        }
        
        Node newNode = new Node(sum % 10);
        carry = sum / 10;
        
        curr.next = newNode;
        curr = curr.next;
    }
    
    if (carry > 0) {
        Node newNode = new Node(carry);
        curr.next = newNode;
    }
    
    return dummyNode.next; 
}
