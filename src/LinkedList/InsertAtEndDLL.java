package LinkedList;

public class InsertAtEndDLL {
	public static void main(String[] args) {
		NodeDLL head= new NodeDLL(10);
		NodeDLL temp1=new NodeDLL(20);
		NodeDLL temp2=new NodeDLL(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		head = insert(head,40);
		printlnDLL(head);
	}

	public static NodeDLL insert(NodeDLL head, int x) {
		
		NodeDLL temp = new NodeDLL(x);
		if(head == null) {
			return temp;
		}
		NodeDLL curr = head;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}

	public static void printlnDLL(NodeDLL head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printlnDLL(head.next);
		
	}


}
