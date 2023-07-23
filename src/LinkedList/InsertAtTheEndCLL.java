package LinkedList;

public class InsertAtTheEndCLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=head;
		printCLL(insert(head,5));

	}
//	public static Node insert(Node head,int x) {
//		
//		Node temp = new Node(x);
//		if(head == null) {
//			temp.next=temp;
//			return temp;
//		}
//		else {
//			Node curr = head;
//			while(curr.next != head) {
//				curr = curr.next;
//			}
//			curr.next = temp;
//			temp.next = head;
//			return head;
//		}
//	}
	
	
	// O(1) solution
	
	public static Node insert(Node head,int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next=temp;
			return temp;
		}else {
			temp.next=head.next;
			head.next=temp;
			int t=temp.data;
			temp.data=head.data;
			head.data=t;
			return temp;
		}
	}

	public static void printCLL(Node head) {
		
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		for(Node i= head.next; i!= head;i=i.next) {
			System.out.print(i.data + " ");
		}
		
		
	}

}
