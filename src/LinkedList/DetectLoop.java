package LinkedList;

class Node5 {
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next=head.next;
		boolean ans = isloop(head);
		System.out.println(ans);
	}
	
	//Method 1
//	static boolean isloop(Node head) {
//		Node temp = new Node(0);
//		Node curr = head;
//		while(curr != null) {
//			if(curr.next == null) {
//				return true;
//			}
//			if(curr.next == temp) {
//				return true;
//			}
//			Node x = curr;
//			curr.next = temp;
//			curr = x.next;
//			
//		}
//		return false;
//		
//	}
	
	//Method 2
	
	static boolean isloop(Node head) {
		
		Node sp=head;
		Node fp = head;
		while(fp.next != null) {
			if(sp.next == null) {
				return true;
			}
			sp = sp.next;
			fp = fp.next.next;
		}
		return true;
	}
	
}