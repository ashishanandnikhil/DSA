package LinkedList;

public class InsertAtLast {

	public static void main(String[] args) {
		
		Node head=null;
		head=insertEnd(head,10);
		head=insertEnd(head,20);
		head=insertEnd(head,30);

		printLL(head);

	}

	public static Node insertEnd(Node head,int x) {
		Node temp=new Node(x);
		if(head == null) {
			return temp;
		}
		Node curr=head;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.next=temp;
		
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
