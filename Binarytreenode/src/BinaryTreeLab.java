public class BinaryTreeLab {
    Node r;
    public BinaryTreeLab(Node r){
        this.r = r;
    }
    void addNewNode(int el){
        Node p = r;
        while (p != null){
            if (el < p.info){
                p = p.left;
            }
            else {
                p = p.right;
            }
        }

        p = new Node(el);
    }
}
