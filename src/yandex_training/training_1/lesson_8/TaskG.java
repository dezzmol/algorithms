package yandex_training.training_1.lesson_8;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        Node parent = new Node(num, null, null, null);

        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            parent.insert(parent, new Node(num));
        }
        if (parent.AVL(parent) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static class Node {
        int key;
        Node left;
        Node right;
        Node parent;

        public Node(int key, Node left, Node right, Node parent) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node insert(Node x, int z) {
            if (x == null) {
                return new Node(z);
            } else if (z < x.key) {
                x.left = insert(x.left, z);
            } else if (z > x.key) {
                x.right = insert(x.right, z);
            }
            return x;
        }

        public void insert(Node x, Node z) {
            while (x != null) {
                if (z.key > x.key) {
                    if (x.right != null) {
                        x = x.right;
                    } else {
                        z.parent = x;
                        x.right = z;
                        break;
                    }
                } else if (z.key < x.key) {
                    if (x.left != null) {
                        x = x.left;
                    } else {
                        z.parent = x;
                        x.left = z;
                        break;
                    }
                } else {
                    return;
                }
            }
        }

        int AVL(Node root) {
            if (root == null)
                return 1;
            int lh = AVL(root.left);
            int rh = AVL(root.right);
            if (lh ==0 && rh == 0 || Math.abs(lh - rh) > 1)
                return 0;
            else
                return Math.max(lh, rh) + 1;
        }

        private int height(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }
}
