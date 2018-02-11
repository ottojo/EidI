public class Node {
    Node left;
    Node right;
    Shape shape;

    Node(Node left, Node right, Shape shape) {
        this.left = left;
        this.right = right;
        this.shape = shape;
    }

    public void insertShape(Shape s) {
        if (this.shape == null) {
            throw new NullPointerException();
        }
        if (s.circumference < this.shape.circumference) {
            insertLeft(s);
        } else if (s.circumference > this.shape.circumference) {
            insertRight(s);
        } else {
            // Umfang gleich
            if (s.calcArea() > this.shape.calcArea()) {
                insertRight(s);
            } else {
                insertLeft(s);
            }
        }
    }

    private void insertLeft(Shape s) {
        if (left == null)
            left = new Node(null, null, s);
        else
            left.insertShape(s);
    }

    private void insertRight(Shape s) {
        if (right == null)
            right = new Node(null, null, s);
        else
            right.insertShape(s);
    }


    void insertAllChildren(Node node) {
        if (node != null) {
            insertShape(node.shape);
            insertAllChildren(node.left);
            insertAllChildren(node.right);
        }
    }

    /**
     * Deletes a shape
     *
     * @param s Shape to delete
     * @return true if shape has been deleted
     */
    boolean delete(Shape s) {
        if (left.shape == s) {
            Node rightNode = left.right;
            left = left.left;
            left.insertAllChildren(rightNode);
            return true;
        } else if (right.shape == s) {
            Node rightNode = right.right;
            right = right.left;
            right.insertAllChildren(rightNode);
            return true;
        } else {
            return left.delete(s) || right.delete(s);
        }
    }
}
