public class Tree {
    Node root;

    public void insert(Shape s) {
        if (root == null) {
            root = new Node(null, null, s);
        } else {
            root.insertShape(s);
        }
    }

    public void delete(Shape s) {
        if (root == null)
            return;
        if (root.shape == s) {
            Node rightNode = root.right;
            root = root.left;
            root.insertAllChildren(rightNode);
        } else {
            root.delete(s);
        }
    }

}


