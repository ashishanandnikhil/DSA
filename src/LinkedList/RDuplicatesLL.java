package LinkedList;

public class RDuplicatesLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		head.next.next.next.next.next = new Node(30);
		head.next.next.next.next.next.next = null;
		head = remove(head);
		printLL(head);

	}

	private static Node remove(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		Node curr = head;
		Node nCurr = head.next;
		while(nCurr != null) {
			if(curr.data == nCurr.data) {
				curr.next = nCurr.next;
				nCurr = nCurr.next;
			}else {
				curr = nCurr;
				nCurr = nCurr.next;
			}
		}
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
