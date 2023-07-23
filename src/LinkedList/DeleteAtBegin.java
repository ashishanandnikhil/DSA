package LinkedList;

public class DeleteAtBegin {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head = deleteHead(head);
		printLL(head);
	}

	public static Node deleteHead(Node head) {
		if(head == null) {
			return null;
		}
		head=head.next;
		return head;
	}

	public static void printLL(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLL(head.next);
		
	}

}
