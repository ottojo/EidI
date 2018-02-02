public class Node {
    Node left;
    Node right;
    int val;

    public int sum() {
        return (left != null ? left.sum() : 0) + (right != null ? right.sum() : 0) + val;
    }
}