package trees;

public class binarytreeclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarytree tree= new binarytree();
		tree.display();
		System.out.println(tree.height());
		tree.postorder();
		System.out.println();
		tree.inorder();
		System.out.println();
		tree.preorder();
		
	}

}
// paste kardo iss line ko direct input mia automatically le lega
// 50 true 3 true 10 false true 21 false false false true 302 true 121 false false false

