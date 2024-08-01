package yandex_training.training_1.lesson_8;

import java.util.Scanner;

public class TaskF {
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
        parent.print(parent);
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

        public void print(Node node) {
            if (node != null) {
                print(node.left);
                if (node.left != null && node.right != null) {
                    System.out.println(node.key);
                }
                print(node.right);
            }
        }
    }
}
