package LinkedList;

public class NthNodefromEnd {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = null;
		node(head,1);

	}

	public static void node(Node head, int x) {
		if(head == null) {
			return ;
		}
		Node curr = head;
		Node fCurr = head;
		while(x > 0 && fCurr != null) {
			fCurr=fCurr.next;
			x--;
		}
		if(fCurr == null) {
			return;
		}
		while(fCurr != null) {
			curr=curr.next;
			fCurr=fCurr.next;
		}
		System.out.println(curr.data);
		
	}

}
