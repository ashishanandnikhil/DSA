package LinkedList;

public class InsertAtGivenPos {

	public static void main(String[] args) {
		Node head= new Node(10);
		head.next= new Node(30);
		head.next.next= new Node(50);
		head.next.next.next= new Node(70);
		head = insert(head,2,20);
		printLL(head);

	}


	public static Node insert(Node head, int pos, int x) {
		
		Node temp= new Node(x);
		if(pos == 1) {
			temp.next=head;
			return temp;
		}
		Node curr=head;
		for(int i=1;i<=pos-2;i++) {
			curr=curr.next;
		}
		if(curr == null) {
			return head;
		}
		temp.next=curr.next;
		curr.next=temp;
		
		return head;
	}
	

	private static void printLL(Node head) {
		
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLL(head.next);
		
	}

}
