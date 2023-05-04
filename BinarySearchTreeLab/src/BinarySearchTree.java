public class BinarySearchTree {
    public static void main(String[] args) {
        BSTtree tree1 = new BSTtree();
        tree1.insert(59);
        tree1.insert(100);
        tree1.insert(20);
        tree1.insert(200);
        System.out.println(tree1.root.info);
        System.out.println(tree1.root.right.info);
        System.out.println(tree1.root.right.right.info);
        System.out.println(tree1.root.left.info);
        BSTnode s = tree1.search(123);
        if (s != null) {
            System.out.println(s.info);
        } else {
            System.out.println("Not found");
        }
        tree1.insert(31);
        tree1.insert(43);
        tree1.insert(150);
        tree1.insert(1911);
        tree1.preorderTraversalInterative();
        System.out.println();
        tree1.preorderTraversalRecursion(tree1.root);
        System.out.println();
        tree1.inorderTraversalRecursion(tree1.root);
        System.out.println();
        tree1.postorderTraversalRecursion(tree1.root);
        //case1 delete root
        //tree1.deleteByMerging(59);//delete root
        //System.out.println("\n" + tree1.root.info);
        // 20
        //   31
        //     43
        //       100
        //          200
        //         150 1911
        //case 2
        //tree1.deletByMerging(31);
        //System.out.println("\n" + tree1.root.left.right.info);
        //case 3 delete 200
        //tree1.deleteByMerging(200);
        //System.out.println("\n" + tree1.root.right.right.info);
        //System.out.println(tree1.root.right.right.right.info);
        //          59
        //      20      100
        //        31       200
        //          43        1911
        tree1.deleteByMerging(150);
        System.out.println("\n" + tree1.root.right.right.left);
    }
}