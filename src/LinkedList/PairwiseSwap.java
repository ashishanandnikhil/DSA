package LinkedList;

public class PairwiseSwap {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		swap(head);
		printLL(head);

	}

//	private static Node swap(Node head) {
//
//		Node curr = head;
//		while (curr != null && curr.next != null) {
//			int temp = curr.data;
//			curr.data = curr.next.data;
//			curr.next.data = temp;
//			curr = curr.next.next;
//		}
//		return head;
//
//	}
	
	private static Node swap(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node curr = head.next.next;
		Node prev = head;
		head = head.next;
		head.next = prev;
		while(curr != null && curr.next != null) {
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = curr;
			curr = next;
		}
		prev.next = curr;
		return head;
		
		
	}

	private static void printLL(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}
