package LinkedList;

public class DeleteHeadCLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		printCLL(del(head));


	}
//	private static Node del(Node head) {
//		if(head == null || head.next == null) {
//			return null;
//		}
//		else {
//		Node curr=head;
//		while(curr.next != head) {
//			curr=curr.next;
//		}
//		curr.next = head.next;
//		return curr.next;
//		}
//		
//	}

	public static Node del(Node head) {
		if(head == null || head.next == null) {
		return null;
	}
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}
	
	
	public static void printCLL(Node head) {
		
		if(head == null) {
			return ;
		}
		System.out.print(head.data + " ");
		for(Node i=head.next;i!= head;i=i.next) {
			System.out.print(i.data + " ");
		}
	}
}
