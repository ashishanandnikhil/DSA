package LinkedList;

public class MiddleOfLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(40);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=null;
		middle(head);
		
	}

	public static void middle(Node head) {
		if(head == null) {
			return ;
		}
		Node curr = head;
		Node fCurr = head;
		while(fCurr.next != null && fCurr != null) {
			curr = curr.next;
			fCurr = fCurr.next.next;
		}
		System.out.println(curr.data);
	}

}
