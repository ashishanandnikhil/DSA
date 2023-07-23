package LinkedList;

public class ReverseLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next= new Node(40);
		head.next.next.next.next= null;
		head = reverse(head,null);
		printLL(head);

	}
	
	

	public static Node reverse(Node curr,Node prev) {
		if(curr == null ) {
			return prev;
		}
		Node next = curr.next;
		curr.next = prev;
		 return reverse(next,curr);
		
	}



//	public static Node reverse(Node head) {
//		
//		if(head == null || head.next == null) {
//			return head;
//		}
//		Node rest_head = reverse(head.next);
//		Node rest_tail = head.next;
//		rest_tail.next = head;
//		head.next = null;
//		return rest_head;
//	}


//	public static Node reverse(Node head) {
//		
//		Node curr = head;
//		Node prev = null;
//		while(curr != null) {
//			Node next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
//		return prev;
//		
//	}

	public static void printLL(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLL(head.next);
		
	}
}
