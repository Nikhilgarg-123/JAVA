package trees;

import java.util.Scanner;

public class binarytree {

	private class Node{
		int data;
		Node left;
		Node right;
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
	}
	
	Node root=null;
	int size=0;
	binarytree(){
		Scanner scn=new Scanner(System.in);
		this.root=takeInput(scn,null,false);
		
	}
	
	private Node takeInput(Scanner scn, Node parent,boolean isleft ) {
		if(parent==null) {
			System.out.println("Enter Data for Root Node: ");
		}
		else {
			if(isleft) {
				System.out.println("Enter data for left child of " + parent.data);
				}
			else {
				
					System.out.println("Enter data for right child of " + parent.data);
					
			}
			}
		
		int nodeData=scn.nextInt();
		Node node = new Node(nodeData,null,null);
		this.size++;
		
		boolean choice=false;
		System.out.println("Do you have left child of " + node.data);
		choice= scn.nextBoolean();
		
		if(choice) {
			node.left= takeInput(scn,node,true);
		}
	
		
		 choice=false;
		System.out.println("Do you have right child of " + node.data);
		choice=scn.nextBoolean();
		
		if(choice) {
			node.right= takeInput(scn,node,false);
		}
		
		
		return  node;
	}
	
	public void display() {
		this.display(this.root);
	}
	
	private void display(Node node) {
		if(node==null)
		{
			return;
		}
		else {
		String str="";
		
		if(node.left!=null)
		{
			str+=node.left.data+" <-";
		}
		else {
			str+="End <-";
		}
		str+=node.data+" -> ";
		if(node.right!=null)
		{
			str+=node.right.data;
		}
		else {
			str+="End";
		}
		System.out.println(str);
			this.display(node.left);

	
			this.display(node.right);

		
		}
	}
	
	
	public int height() {
	return	this.height(this.root);
	}
	
	private int height(Node root) {
		
		if(root==null) {
			return -1;
		}
	int lh=	this.height(root.left);
	int rh= this.height(root.right);;
		
	int height=Math.max(lh, rh)+1;
	return height;

	}
	
	public void postorder() {
		this.postorder(this.root);
	}
	private void postorder(Node node) {
		
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data +" ->");
		
	}
	
	public void inorder() {
		this.inorder(this.root);
	}
	private void inorder(Node node) {
		
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data +" ->");

		inorder(node.right);
		
	}
	
	public void preorder() {
		this.preorder(this.root);
	}
	private void preorder(Node node) {
		
		if(node==null) {
			return;
		}
		System.out.print(node.data +" ->");

		preorder(node.left);

		preorder(node.right);
		
	}
	
	
	
}
