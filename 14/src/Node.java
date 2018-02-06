//package blatt14;

public class Node {
	Node left;
	Node right;
	Shape shape;
	
	Node(){
	}
	
	Node(Node left, Node right, Shape shape){
		this.left = left;
		this.right = right;
		this.shape = shape;
	}

}
