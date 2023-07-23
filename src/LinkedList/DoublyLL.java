package LinkedList;

class NodeDLL {
	int data;
	NodeDLL prev;
	NodeDLL next;
	NodeDLL(int x) {
		data=x;
		prev=null;
		next=null;
	}
}
public class DoublyLL {

	public static void main(String[] args) {
		NodeDLL head= new NodeDLL(10);
		NodeDLL temp1=new NodeDLL(20);
		NodeDLL temp2=new NodeDLL(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		
		printlnDLL(head);
	}

	public static void printlnDLL(NodeDLL head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printlnDLL(head.next);
		
	}

}
