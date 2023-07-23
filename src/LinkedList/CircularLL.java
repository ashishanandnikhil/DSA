package LinkedList;

public class CircularLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(5);
		Node temp2 = new Node(20);
		Node temp3 = new Node(15);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = head;
		printCLL(head);

	}

	public static void printCLL(Node head) {
	
		if(head == null) {
			return ;
		}
		System.out.println(head.data);
		for(Node i=head.next;i!= head;i=i.next) {
			System.out.println(i.data);
		}
	}

}
