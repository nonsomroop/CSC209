public class Node {
    int info;
    Node left, right;

    public Node(int el){
        this(el, null, null);
    }

    public Node(int el, Node l, Node r){
        info = el;
        left = l;
        right = r;
    }

}
