import java.util.*;

public class Main {
    static class Node {
        char value;
        Node left, right;

        Node(char value) {
            this.value = value;
        }
    }

    static Node[] tree = new Node[26];

    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value);
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char parent = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);

            if (tree[parent - 'A'] == null) {
                tree[parent - 'A'] = new Node(parent);
            }

            if (left != '.') {
                if (tree[left - 'A'] == null) {
                    tree[left - 'A'] = new Node(left);
                }
                tree[parent - 'A'].left = tree[left - 'A'];
            }

            if (right != '.') {
                if (tree[right - 'A'] == null) {
                    tree[right - 'A'] = new Node(right);
                }
                tree[parent - 'A'].right = tree[right - 'A'];
            }
        }

        preorder(tree[0]);
        System.out.println();
        inorder(tree[0]);
        System.out.println();
        postorder(tree[0]);
        System.out.println();
    }
}
