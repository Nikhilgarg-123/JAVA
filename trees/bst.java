package trees;

public class bst {

	private class Node{
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public bst(int[] arr) {
		this.root= construct(arr, 0, arr.length - 1);

	}

	private Node construct(int[] arr, int low, int high) {
		if(low>high) {
			return null;
		}
		int mid=(low+high)/2;
		Node nn= new Node();
		nn.data=arr[mid];
		nn.left= construct(arr,low,mid-1);
		nn.right= construct(arr,mid+1,high);
		
		return nn;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
