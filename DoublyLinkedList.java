//creating a doubly linked list
/**
 * addNode()
 * addFirst()
 * insert(position,value)
 * toString()
 * display()
 * deleteFirst()
 * deleteLast()
 * delete(index)
 * reversePrint()
 * size()*/
public class DoublyLinkedList {
	//Represent the head and tail nodes of the Doubly linked list.
	public Node head=null;
	public Node tail=null;
	private int size=0;//initialization of the size.
	class Node{
		int value;
		Node previous;
		Node next;
		public Node(int value) {
			this.value=value;
			previous=null;
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
				newNode.previous=tail;
				//the new node will add after the tail so make the current tail to point the nextnode.
				tail.next=newNode;
				//now new node will become the new tail of the node.
				tail=newNode;
			}
			//while adding the node the size will get increased by one.
			size++;
		}
		
		//addFirst() function adds the element in the first position of to the list.
		public void addFirst(int value) {
				Node insertNode = new Node(value);
				insertNode.next=head;//make the insert node to point the head.
				head.previous=insertNode;//make the current node's previous to point the newNode.
				head=insertNode;//And the head to the insert node.
				//increment the size by one.
				size++;
		}
		
		//insert(position of the node to be insert & value of the node) method adds the node at the specific position on the list.
				public void insert(int position,int value) throws Exception{
					//check the position is inside the list.
					if(position>size) {
						
						//if not throws the exception state that the position is not in the list.
						throw new Exception("position is not valid!");
					}
					
					//if the position is zero call the addFirst() method,this will add the node at the front of the list.
					if(position==0) {
						addFirst(value);
						return;
					}
					else {
						//create a new ,current & temporary nodes .
						Node insertNode=new Node(value); //insert node holds the value of the new node to be inserted.
						Node current=null;
						Node temp=head;//make the temporary node to point the head and traverse until before the position.
						int traverseVar=0;
						while(traverseVar<position) {
							current=temp;//now the current node points the previous node of the position.
							temp=temp.next;//make the temporary node to point the node at position.
							traverseVar++;
						}
						insertNode.previous=current;
						//insert the reference of the new node to the pervious node's next.
						current.next=insertNode;
						//insert the reference of the  node that is already at that position to the newNode's next.
						insertNode.next=temp;
						
					}
					//increment the size by 1.
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
					while(presentNode.next!=null) {
						strRepresent+=presentNode.value;
						strRepresent+=",";
						presentNode=presentNode.next;
					}
					strRepresent+=presentNode.value+"]";
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
					//traversing the node using the next reference until the end .
					while(presentNode.next!=null) {
						//print the current node on console using print function.
						System.out.print(presentNode.value+",");
						presentNode=presentNode.next;
					}
					System.out.print(presentNode.value+"]");
					System.out.println();
				}
				
	
	
				//deleteFirst() delete's the first element from the list.
				public void deleteFirst()throws Exception{
					//check if the list is empty throw exception 
					if(head==null) {
						throw new Exception("there is no element to Delete");
					}
					//make the head to point the next node and sever the ties between the fist node & list.
					head=head.next;
					//make the new first node's previous to null.
					head.previous=null;
					//Decrement the size by 1.
					size--;
				}
				
				
				//method delete's the last element from the list.
				public void deleteLast() throws Exception {
					Node current=head;
					int traverseVar=1;
					
					//traverse till the second last node.
					while(traverseVar!=size-1) {
						if(current==null) {
							//list is empty throw the exception.
							throw new Exception("No elements to delete"+size);
						}
						current=current.next;
						traverseVar++;
					}
					//current node become the new tail.
					tail=current;
					//make the second lastNode's next to point null.
					current.next=null;
					//decrement the size by 1.
					size--;
					
				}
				
				//delete(position) deletes the node in the specific position.
				public	void delete(int index) throws Exception {
						if(index==size-1)//if it's a last position call deleteLast()
						{
							deleteLast();
							return;
						}
						if(index==0)//if it's a last position call deleteFirst()
						{
							deleteFirst();
							return;
						}
						Node current=head;
						int traverseVar=1;
						//traverse before till the position
						while(traverseVar<index) {
							if(current==null) {
								//list is empty throw the exception.
								throw new Exception("out of the range:position"+index);
							}
							//make the current node to point the node  previous to the deleting node.
							current=current.next;
							traverseVar++;
						}
						//make the temp to point the next node to the deleting node.
						Node temp=current.next;
						temp=temp.next;
						//make the deleted node's next node's previous to point the current.
						temp.previous=current;
						//make the current node's next to point the next node to the deleting node.
						current.next=temp;
						//decrement the size by 1.
						size--;
					}
				public void revresePrint() {
					//create a node point to head.
					Node presentNode=tail;
					//if the head is null mention the list is empty & return. 
					if(head == null) {
						System.out.println("List is Empty");
						return;
					}
					System.out.print("[");
					//traversing the node using the next reference until the end .
					while(presentNode.previous!=null) {
						//print the current node on console using print function.
						System.out.print(presentNode.value+",");
						presentNode=presentNode.previous;
					}
					System.out.print(presentNode.value+"]");
					System.out.println();
				}
				
				//size() function returns the size of the list.
				public int size() {
					return size;
				}
}
