//package blatt14;

public class Tree {
	Node root;
	
	void insert(Shape s) {
		if(root==null) {
			root = new Node(null,null,s);
		}
		else
			insert(s,root);
	}
	
	private void insert(Shape s, Node node) {
		if(node!=null) {
			if(node.shape.circumference > s.circumference) {
				if(node.left!=null)
					insert(s,node.left);
				else
					node.left = new Node(null,null,s);
			}
			else if(node.shape.circumference < s.circumference) {
				if(node.right!=null)
					insert(s,node.right);
				else
					node.right = new Node(null,null,s);
			}
			else if(node.shape.circumference == s.circumference){
				if(node.shape.calcArea() >= s.calcArea()) {
					if(node.left!=null)
						insert(s,node.left);
					else
						node.left = new Node(null,null,s);
				}
					
				else if(node.shape.calcArea() < s.calcArea()) {
					if(node.right!=null)
						insert(s,node.right);
					else
						node.right = new Node(null,null,s);
				}
					
			}		
		}
		else
			throw new NullPointerException();
	}

}
