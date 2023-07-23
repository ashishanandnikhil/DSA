package LinkedList;

public class DeleteLastNodeDLL {

	public static void main(String[] args) { 
		NodeDLL head = new NodeDLL(10);
		NodeDLL temp1 = new NodeDLL(20);
		NodeDLL temp2 =  new NodeDLL(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		head = delete(head);
		printlnDLL(head);

		
	}

	public static NodeDLL delete(NodeDLL head) {
		
		if(head == null || head.next == null) {
			return null;
		}
		NodeDLL curr=head;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.prev.next=null;
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
