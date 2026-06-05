class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Main{
    static Node Array2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }
    static Node reverse(Node head){
        if(head==null || head.next == null)return head;
        Node curr = head;
        Node prev = null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev;
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
		head = reverse(head);
		display(head);
	}
}

/*  Main Logic
prev = curr.prev;
curr.prev = curr.next;
curr.next = prev;
curr = curr.prev;
return prev;*/
