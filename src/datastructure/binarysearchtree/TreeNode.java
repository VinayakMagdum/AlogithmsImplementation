package datastructure.binarysearchtree;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value == data) {
            return;
        }

        if(value < data) {
            if(left != null) {
                left.insert(value);
            } else {
                left = new TreeNode(value);
            }
        } else {
            if(right != null) {
                right.insert(value);
            } else {
                right = new TreeNode(value);
            }
        }
    }

    public void traverseInOrder() {
        if(left != null) {
            left.traverseInOrder();
        }
        System.out.print(data + ", ");

        if(right != null) {
            right.traverseInOrder();
        }
    }

    public void preOrderTraversal() {
        System.out.print(data + ", ");
        if(left != null) {
            left.preOrderTraversal();
        }
        if(right != null) {
            right.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if(left != null) {
            left.postOrderTraversal();
        }
        if(right != null) {
            right.postOrderTraversal();
        }
        System.out.print(data + ", ");
    }

    public TreeNode get(int value) {
        if(value == data) {
            return this;
        }
        if(value < data) {
            if(left != null)
                return left.get(value);
        } else {
            if(right != null)
                return right.get(value);
        }
        return null;
    }

    public int min() {
        if(left == null) {
            return data;
        } else  {
            return left.min();
        }
    }

    public int max() {
        if(right == null) {
            return data;
        } else {
            return right.max();
        }
    }

    public String toString() {
        return "Data = " + data;
    }
}
