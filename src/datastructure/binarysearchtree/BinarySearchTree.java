package datastructure.binarysearchtree;

public class BinarySearchTree {
    public TreeNode root;

    public void insert(int value) {
        if(root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if(root != null) {
            root.traverseInOrder();
        }
    }

    public void preOrderTraversal() {
        if(root != null) {
            root.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if(root != null) {
            root.postOrderTraversal();
        }
    }

    public TreeNode get(int value) {
        if(root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if(root != null) {
            return root.min();
        }
        return -1;
    }

    public int max() {
        if(root != null) {
            return root.max();
        }
        return -1;
    }

    public void delete(int value) {
        root = delete(root, value);

    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if(subTreeRoot == null) {
            return subTreeRoot;
        }

        if(value < subTreeRoot.data) {
            subTreeRoot.left =  delete(subTreeRoot.left, value);
        } else if(value > subTreeRoot.data) {
            subTreeRoot.right = delete(subTreeRoot.right, value);
        } else {

            //Case : Node has only one child(left or right)
            if(subTreeRoot.left == null) {
                return subTreeRoot.right;
            } else if(subTreeRoot.right == null) {
                return subTreeRoot.left;
            }

            //Case : Node has two child

            //Replace the value in the subTreeRoot node with the smallest value from
            // the right sub tree
            subTreeRoot.data = subTreeRoot.right.min();

            // Delete the node that has smallest value in the right sub tree
            subTreeRoot.right = delete(subTreeRoot.right, subTreeRoot.data);
        }
        return subTreeRoot;
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.preOrderTraversal();
        System.out.println();

//        tree.postOrderTraversal();
//        System.out.println();

//        System.out.println(tree.get(15));
//        System.out.println(tree.get(32));
//
//        System.out.println("Min in the tree : " + tree.min());
//        System.out.println("Max in the tree : " + tree.max());

//        tree.delete(15);
//        tree.traverseInOrder();
//        System.out.println();
//
//        tree.delete(27);
//        tree.traverseInOrder();
//        System.out.println();
//
//        tree.delete(251);
//        tree.traverseInOrder();
//        System.out.println();


    }
}
