public class Tree {
    private Node root;

    public int sum() {
        return root != null ? root.sum() : 0;
    }
}
