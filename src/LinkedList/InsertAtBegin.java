package LinkedList;

//class Node{
//	int data;
//	Node next;
//	Node(int x) {
//		data=x;
//		next=null;
//	}
//}
public class InsertAtBegin {

	public static void main(String[] args) {
		Node head=null;
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		printLL(head);

	}


	public static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
	
	public static void printLL(Node head) {
		if(head == null) {
			return;
		}
		System.out.println(head.data);
		printLL(head.next);
		
	}

}
