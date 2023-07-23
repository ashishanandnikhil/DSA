package LinkedList;

public class SearchInLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next= new Node(40);
		head.next.next.next.next= new Node(50);
		System.out.println(search(head,30));

	}
	
	//Iterative Approach

//	public static int search(Node head, int x) {
//		
//		int idx=1;
//		Node curr= head;
//		while(curr.data != x) {
//			curr=curr.next;
//			idx++;
//		}
//		return idx;
//	}
	
	
	// Recursive Apprach
	public static int search(Node head, int x) {
		
		if(head == null) {
			return -1;
		}
		
		if(head.data == x) {
			return 1;
		}
		int res=search(head.next,x);
		if(res == -1) {
			return -1;
		} else {
			return (res+1);
		}
	}
}
