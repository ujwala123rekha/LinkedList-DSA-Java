class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main{
    static Node Array2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    static Node insertAtBeg(Node head,int data){
        Node n = new Node(data);
        n.next = head;
        return n;
    }
    static Node insertAtEnd(Node head,int data){
        Node n = new Node(data);
        if(head == null)return n;
        Node mover = head;
        while(mover.next!=null){
            mover = mover.next;
        }
        mover.next = n;
        return head;
    }
    static Node InsertAtPos(Node head,int data,int position){
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            return newNode; 
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Position out of bounds");
        }

        return head;
    }
    static Node DelAtBeg(Node head){
        if(head == null || head.next ==null)return null;
        head = head.next;
        return head;
    }
    static Node DelAtEnd(Node head){
        if(head == null || head.next == null)return null;
        Node mover = head;
        while(mover.next.next!=null){
            mover = mover.next;
        }
            mover.next = null;
        return head;
    }
    static Node DelAtPos(Node head,int pos){
        if(head==null)return null;
        if(pos==1)return head.next;
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Deletion position out of bounds");
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
    static void display(Node head){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+", ");
            node = node.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Node head = Array2LL(arr);
		System.out.println(head.data);
		display(head);
		head = insertAtBeg(head,0);
		display(head);
		insertAtEnd(head,5);
		display(head);
		head = InsertAtPos(head, 99, 4); 
    display(head);
    head = DelAtBeg(head);
    display(head);
    head = DelAtEnd(head);
    display(head);
    head = DelAtPos(head,2);
    display(head);
	}
}
