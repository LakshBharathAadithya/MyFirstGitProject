package Selenium;

public class SingleLinkedList {
	
	public static Node head=null;
	public Node tail=null;
	
	public 	void addnode(int data) {
		Node newnode=new Node(data);
		if (head==null) {
			this.head=newnode;
			this.tail=newnode;
		
			
		}else {
			tail.next=newnode;
			tail=newnode;
		}
		
	}
	
	
	public void displaynode(Node head) {
		Node now=head;
		if(now==null) {
			System.out.println("The List is empty");
			return;
		}
	System.out.println("The Linked List is :");
	while(now!=null) {
		System.out.print(now.value+" ");
		now=now.next;
	}
	System.out.println();
	}
	
	public  void displayrevrsenode() {
		Node ne=head;
		Node prev=null;
		Node next=null;
		if (head==null) {
			System.out.println("The linkedlist is null");
			return ;
		}
		while(ne!=null) {
			next=ne.next;
			ne.next=prev;
			prev=ne;
			ne=next;
			
		}
		new SingleLinkedList().displaynode(prev);
	}
	
	
	public static void main(String[] args) {
		SingleLinkedList slist=new SingleLinkedList();
		slist.addnode(10);
		slist.addnode(20);
		slist.addnode(30);
		slist.addnode(40);
		slist.addnode(50);
		slist.addnode(60);
		slist.displaynode(head);
		slist.displayrevrsenode();
		
	}

}
