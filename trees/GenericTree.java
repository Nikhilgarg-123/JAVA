package trees;

import java.util.*;

public class GenericTree {

	
	//making node class  
	private class Node{
		int data;
		ArrayList<Node> children;
		
		Node(int data){
			this.data= data;
			this.children=new ArrayList<>();
			
		}
	}
	
	private Node root;
	private int size;
	
	GenericTree(){
		Scanner s= new Scanner(System.in);
		this.root = takeInput(s,null,0 );
		
		
	}
	
	
	
	
	//to take input in generic tree
	private Node takeInput(Scanner s, Node parent, int ithchild) {
		if(parent==null) {
			System.out.println("enter data for root node");
			
		}
		else {
			System.out.println("enter data for "+ithchild+"th child of "+parent.data);
		}
		int nodedata=s.nextInt();
		Node  node = new Node(nodedata);
		this.size++;
		
		System.out.println("enter number of children for "+ node.data);
		int children= s.nextInt();
		
		
		//will be executed according to value of children
		for(int i=0;i<children;i++) {
			Node child = this.takeInput(s,node  , i);
			node.children.add(child);
			
		}return node;
		
	}
	
	
	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		
		String str= node.data +"=> " ;
		for(int i=0;i<node.children.size();i++) {
			str=str+node.children.get(i).data  + " ";
		}
		
		str=str+", END";
		
		System.out.println(str);
		for(int i=0;i<node.children.size();i++) {
this.display(node.children.get(i));			 
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
