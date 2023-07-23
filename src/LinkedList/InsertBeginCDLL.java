package LinkedList;

public class InsertBeginCDLL {

	public static void main(String[] args) {
		NodeDLL head = new NodeDLL(10);
		NodeDLL temp1 = new NodeDLL(20);
		NodeDLL temp2 = new NodeDLL(30);
		head.prev=temp2;
		head.next = temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		temp2.next=head;
		printCLL(insert(head , 5));
	}
	
	public static NodeDLL insert(NodeDLL head,int x) {
		NodeDLL temp = new NodeDLL(x);
		if(head == null) {
			temp.next = temp;
			temp.prev = temp;
		}else {
			temp.prev = head.prev;
			temp.next = head;
			head.prev.next = temp;
			head.prev = temp;			
		}
		return temp;
	}

	public static void printCLL(NodeDLL head) {
		
		if(head == null) {
			return ;
		}
		System.out.print(head.data + " ");
		for(NodeDLL i=head.next;i!= head;i=i.next) {
			System.out.print(i.data + " ");
		}
	}

}
