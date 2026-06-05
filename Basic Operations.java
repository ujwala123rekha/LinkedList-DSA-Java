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
    static int LengthOfLL(Node head){
        int count =0;
        Node node = head;
        while(node!=null){
            count++;
            node = node.next;
        }
        return count;
    }
    static void display(Node head){
        Node node = head;
        while(node!=null){
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }
    static int search(Node head,int target){
        Node node = head;
        while(node!=null){
            if(node.data == target){
                return 1;
            }
            node = node.next;
        }
        return 0;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Node head = Array2LL(arr);
		System.out.println(head.data);
		display(head);
		System.out.println(LengthOfLL(head));
		System.out.print(search(head,8));
	}
}
