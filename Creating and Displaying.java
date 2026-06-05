class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main{
  //the first is head then mover is used to attach links and temp creates the new node so we can connect both
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
    static void display(Node head){
        Node node = head;
        while(node!=null){
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Node head = Array2LL(arr);
		System.out.println(head.data);
		display(head);
	}
}
