package LinkedList;

 class Node {
	int data;
	Node next;
	Node(int x) {
		data=x;
		next=null;
	}
}

public class TraversingLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		 head.next= new Node(20);
		 head.next.next= new Node(30);
		 head.next.next.next= new Node(40);
		 printLL(head);
		

	}

	public static void printLL(Node head) {
		
//		Node curr = head;
//		while(curr != null) {
//			System.out.print(curr.data+ " ");
//			curr=curr.next;
//		}
		
		// Recursive 
		if(head == null) {
			return;
		}
		
		System.out.println(head.data);
		printLL(head.next);
		
	}

}
