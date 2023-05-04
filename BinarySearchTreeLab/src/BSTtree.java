import java.util.Stack;

public class BSTtree {
    BSTnode root;

    public BSTtree() {
        root = null;
    }
    //insert method
    //print all node => traverse => Tree traversal
    //delete node
    //search on tree
    //balance

    public void insert(int newInfo) {
        BSTnode temp = root;
        if (temp == null) {
            root = new BSTnode(newInfo);
            return;
        }
        while (true) {
            if (newInfo < temp.info && temp.left != null) {
                temp = temp.left;
            } else if (newInfo >= temp.info && temp.right != null) {
                temp = temp.right;
            } else if (newInfo < temp.info && temp.left == null) {
                temp.left = new BSTnode(newInfo);
                break;
            } else if (newInfo >= temp.info && temp.right == null) {
                temp.right = new BSTnode(newInfo);
                break;
            }
        }
    }

    public BSTnode search(int key) {
        BSTnode temp = root;
        if (temp == null) {
            return null;
        }
        while (true) {
            if (key == temp.info) {
                return temp;
            } else if (key < temp.info && temp.left != null) {
                temp = temp.left;
            } else if (key >= temp.info && temp.right != null) {
                temp = temp.right;
            } else {
                return null;
            }
        }
    }

    public void preorderTraversalInterative() {
        BSTnode temp = root;
        if (temp != null) {
            Stack st = new Stack();
            st.push(temp);
            while (!st.empty()) {
                temp = (BSTnode) st.pop();
                temp.visit();
                if (temp.right != null) {
                    st.push(temp.right);
                }
                if (temp.left != null) {
                    st.push(temp.left);
                }
            }
        }
    }

    public void preorderTraversalRecursion(BSTnode node) {
        if (node != null) {
            node.visit();
            preorderTraversalRecursion(node.left);
            preorderTraversalRecursion(node.right);
        }
    }

    public void inorderTraversalRecursion(BSTnode node) {
        if (node != null) {
            inorderTraversalRecursion(node.left);
            node.visit();
            inorderTraversalRecursion(node.right);
        }
    }

    public void postorderTraversalRecursion(BSTnode node) {
        if (node != null) {
            postorderTraversalRecursion(node.left);
            postorderTraversalRecursion(node.right);
            node.visit();
        }
    }


    public void deleteByMerging(int value) {
        BSTnode p = root, prev = null, node, temp;
        //search for the deleted node
        while (p != null && p.info != value) {
            prev = p;
            if (value < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        node = p;
        if (p != null && p.info == value) {
            if (p.right == null) { //deleted node has no right child
                node = node.left;
            } else if (p.left == null) { //deleted node has no left child
                node = node.right;
            } else { //deleted node has both left and right childen
                temp = p.left;
                //search for the right most node of the left subtree
                //               of the deleted node
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = p.right;
                node = p.left;
            }
            if (p == root) { //deleted node is the root
                root = node;
            } else if (p == prev.left) { //deleted node is on the left of the parent
                prev.left = node;
            } else { //deleted node is on tthe right of the parent
                prev.right = node;
            }
        } else if (root != null) {
            System.out.println("No " + value + " to delete from the tree.");
        } else {
            System.out.println("Tree is empty. Nothing to delete");
        }
    }
}
