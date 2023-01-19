//creating of a singly linked list
public class SinglyLinkedList {
	//Represent the head and tail nodes of the singly linked list.
	public Node head= null;
	public Node tail= null;
	private int size=0;//initialization of the size.
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
			next=null;
		}
	}
	
	//addNode will add new node to the list.
	public void addNode(int value) {
		
		//create a new node.
		Node newNode=new Node(value);
		
		//checks if the list is empty.
		if(head==null) {
			//if the list is empty then point the head and tail to the new node.
			head= newNode;
			tail=newNode;
		}
		else {
			//the new node will add after the tail so make the current tail to point the nextnode.
			tail.next=newNode;
			//now new node will become the new tail of the node.
			tail=newNode;
		}
		//while adding the node the size will get increased by one.
		size++;
	}
	
	
	//toString() method returns the list as a single string.
	public String toString() {
		//create a node that point to the head.
		Node presentNode=head;
		String strRepresent=""; //Initialization of the string to represent the list.
		//if the head is null then return with [] because there is no nodes to be print.
		if(head == null) {
			return "[]";
		}
		strRepresent+="[";
		//traverse to the end of the node until the node becomes null,in the last node the next will contains null.
		while(presentNode!=null) {
			strRepresent+=presentNode.value;
			strRepresent+=" ";
			presentNode=presentNode.next;
		}
		strRepresent+="]";
		//returns the string representation of the list.
		return strRepresent;
	}
	
	//display() method prints the list directly when it<s called.
	public void display() {
		//create a node point to head.
		Node presentNode=head;
		//if the head is null mention the list is empty & return. 
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.print("[");
		while(presentNode!=null) {
			System.out.print(presentNode.value+" ");
			presentNode=presentNode.next;
		}
		System.out.print("]");
		System.out.println();
	}
	
	public void insert(int position,int value) throws Exception{
		if(position>size) {
			throw new Exception("position is not valid!");
		}
		if(position==0) {
			addFirst(value);
			return;
		}
		else {
			Node insertNode=new Node(value);
			Node current=null;
			Node temp=head;
			int traverseVar=0;
			while(traverseVar<position) {
				current=temp;
				temp=temp.next;
				traverseVar++;
			}
			current.next=insertNode;
			insertNode.next=temp;
			
		}
		size++;
	}

	public void deleteFirst()throws Exception{
		if(head==null) {
			throw new Exception("there is no element to Delete");
		}
		head=head.next;
		size--;
	}
	
	public void deleteLast() throws Exception {
		Node current=head;
		int traverseVar=1;
		while(traverseVar!=size-1) {
			if(current==null) {
				throw new Exception("No elements to delete"+size);
			}
			current=current.next;
			traverseVar++;
		}
		current.next=null;
		size--;
		
	}
	public	void delete(int position1) throws Exception {
			Node current=head;
			int traverseVar=1;
			while(traverseVar!=position1) {
				if(current==null) {
					throw new Exception("out of the range:position"+position1);
				}
				current=current.next;
				traverseVar++;
			}
			Node temp=current.next;
			temp=temp.next;
			current.next=temp;
			size--;
		}
	
	public int size() {
		return size;
	}
	
	public void addFirst(int value) {
			Node insertNode = new Node(value);
			insertNode.next=head;
			head=insertNode;
			if(tail==null) {
				tail=insertNode;
			}
			size++;
	}
}
