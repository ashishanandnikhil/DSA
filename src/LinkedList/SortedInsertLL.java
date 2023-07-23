package LinkedList;

public class SortedInsertLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		head = sort(head,25);
		printLL(head);

	}
	public static Node sort(Node head,int x) {
		Node temp = new Node(x);
		if(head == null) {
			return temp;
		}
		if(x < head.data) {
			temp.next=head;
			return temp;
		}
		Node curr = head;
		while(curr.next != null && curr.next.data < x) {
			curr = curr.next;
		}
		temp.next=curr.next;
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
