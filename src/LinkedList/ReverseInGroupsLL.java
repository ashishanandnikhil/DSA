package LinkedList;

public class ReverseInGroupsLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = new Node(70);
		head.next.next.next.next.next.next.next = null;
		head = remove(head,3);
		printLL(head);

	}

	public static Node remove(Node head,int k) {
		Node curr = head;
		Node prevFirst = null;
		boolean isFIrstPass = true;
		while(curr != null) {
			Node first = curr;
			Node prev = null;
			Node next = null;
			int count = 0;
			while(curr != null && count < k) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if(isFIrstPass) {
				head = prev;
				isFIrstPass = false;
			}else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return head;
	}

	
	
	
	
	
	
	

//	public static Node remove(Node head,int k) {
//		Node curr = head;
//		Node prev = null;
//		Node next = null;
//		int count = 0;
//		while(curr != null && count < k) {
//			next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//			count++;
//		}
//		if(next != null) {
//			Node rest_head = remove(next,k);
//			head.next = rest_head;
//		}
//		return prev;
//	}



	public static void printLL(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLL(head.next);
		
	}
}
