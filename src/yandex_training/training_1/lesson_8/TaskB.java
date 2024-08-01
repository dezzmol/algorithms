package yandex_training.training_1.lesson_8;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        Node parent = new Node(num, null, null, null);
        System.out.print((parent.DepthOfTree(parent) + 1) + " ");
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            Node child = new Node(num);
            parent.insert(parent, child);
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
                        System.out.print((DepthOfTree(z) + 1) + " ");
                        break;
                    }
                } else if (z.key < x.key) {
                    if (x.left != null) {
                        x = x.left;
                    } else {
                        z.parent = x;
                        x.left = z;
                        System.out.print((DepthOfTree(z) + 1) + " ");
                        break;
                    }
                } else {
                    z.parent = x.parent;
                    z.left = x.left;
                    z.right = x.right;
                    return;
                }
            }
        }

        public int HeightOfTree(Node node) {
            if (node == null) {
                return 0;
            }
            int left, right;
            if (node.left != null) {
                left = HeightOfTree(node.left);
            } else {
                left = -1;
            }
            if (node.right != null) {
                right = HeightOfTree(node.right);
            } else {
                right = -1;
            }
            int max = Math.max(left, right);
            return max + 1;
        }

        public int DepthOfTree(Node node) {
            if (node.parent == null) {
                return 0;
            }
            return 1 + DepthOfTree(node.parent);
        }
    }
}
