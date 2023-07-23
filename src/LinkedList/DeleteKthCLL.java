package LinkedList;

public class DeleteKthCLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = head;
		printCLL(del(head,1));


	}

		public static Node del(Node head, int k) {
		int count =1;
		Node curr = head;
		Node nCurr = head.next;
		while(count < k-1) {
			curr = nCurr;
			nCurr = nCurr.next;
			count++;
		}
		curr.next=nCurr.next;
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
