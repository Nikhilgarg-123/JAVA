package linked_list;

public class linkedlist {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public void addLast(int item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
			return;
		}

		if (this.size >= 1) {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void addfirst(int n) {
		Node nn = new Node();
		nn.data = n;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
			return;
		}

		nn.next = head;
		head = nn;
		this.size++;
	}

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty! ");
		}
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty! ");
		}

		return this.tail.data;
	}

	public int getatindex(int index) throws Exception {

		if (size == 0) {
			throw new Exception("LL IS EMPTY");

		}
		if (index < 0 || index >= this.size) {
			throw new Exception("index invalid");
		}
		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	public Node getNodeatindex(int index) throws Exception {

		if (size == 0) {
			throw new Exception("LL IS EMPTY");

		}
		if (index < 0 || index >= this.size) {
			throw new Exception("index invalid");
		}
		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void add_at(int x, int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("index invalid");
		}

		if (index == 0) {
			addfirst(x);
		} else if (index == this.size - 1) {
			addLast(x);
		}

		Node nn = new Node();
		nn.data = x;
		nn.next = null;
		Node a1 = getNodeatindex(index - 1);
		Node a2 = a1.next;

		a1.next = nn;
		nn.next = a2;
		this.size++;

	}
	
	public void removeFirst() throws Exception{
		if(size==0) {
			throw new Exception("LL IS EMPTY! " );
		}
		if(size==1) {
			head=null;
			tail=null;
			size=0;
			return;
		}
		else {
		
		head=head.next;
		this.size--;
	}
		}
	public void removeLast() throws Exception{
		if(this.size==0) {
			throw new Exception("LL not found! ");
		}
		
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size--;
		}
		else {
			Node temp= getNodeatindex(this.size - 2 );
			this.size--;
			this.tail= temp;
			temp.next=null;
			
			}
		}
	
	public void removeat(int index) throws Exception{
		
		if(this.size==0) {
			throw new Exception("LL Not FOUND! ");
			}
		
		if(index<0 || index>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		if(index==0) {
			 removeFirst();
			 return;
		}
		else if(index==this.size-1){
			removeLast();
			return ;
		}
		else {
			
			Node temp =  getNodeatindex(index-1);
			Node temp2=temp.next.next;
			
			temp.next=temp2;
			this.size--;
			
		}
		
		
	}
	
	public void reversedata() throws Exception{
		int left=0;
		int right= this.size-1;
		while(left<right) {
			Node temp1=getNodeatindex(left);
			Node temp2= getNodeatindex(right);
			
			int tempdata=temp1.data;
			temp1.data=temp2.data;
			temp2.data= tempdata;
			
			left++;
			right--;
			
		}
	}
		
	
	
	

	public static void main(String[] args) {

	}

}
