package LinkedList;

public class InsertionInDLL {
	
	public static void main(String[] args) {
		NodeDLL head= null;
		head=insertBegin(head,30);
		head=insertBegin(head,20);
		head=insertBegin(head,10);
		head=insertBegin(head,5);
		printDLL(head);
	}

	public static NodeDLL insertBegin(NodeDLL head, int x) {
		
		NodeDLL temp= new NodeDLL(x);
		temp.next=head;
		
		if(head != null) {
		head.prev=temp;
		}
		
		return temp;
	}

	public static void printDLL(NodeDLL head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printDLL(head.next);
		
		
	}
	
}
