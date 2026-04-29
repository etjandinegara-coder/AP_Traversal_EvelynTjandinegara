package traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    int data;
    List<Node> children;

    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class DynamicTreeLeaves {
    static Scanner scanner = new Scanner(System.in);

    public static Node buildTree() {
        System.out.print("Masukkan data untuk node: ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);

        System.out.print("Berapa jumlah anak untuk node " + data + ": ");
        int numChildren = scanner.nextInt();

        for (int i = 0; i < numChildren; i++) {
            System.out.println("Masukkan anak ke-" + (i + 1) + " dari node " + data + ":");
            newNode.children.add(buildTree());
        }

        return newNode;
    }

    public static void printLeaves(Node node) {
        if (node == null) return;
    
        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
            return;
        }

        for (Node child : node.children) {
            printLeaves(child);
        }
    }

    public static void printAtDepth(Node node, int targetDepth, int currentDepth) {
        if (node == null) return;

        // Kalau sudah sampai depth yang diminta
        if (currentDepth == targetDepth) {
            System.out.print(node.data + " ");
            return; // jangan lanjut ke bawah
        }

        // Kalau belum sampai, lanjut ke anak-anak
        for (Node child : node.children) {
            printAtDepth(child, targetDepth, currentDepth + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Pembuatan Tree");
        Node node = buildTree();

        System.out.println("\nLeaf nodes :");
        printLeaves(node);
        System.out.println();

        System.out.print("\nMasukkan depth yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        System.out.println("Node pada depth " + n + ":");
        printAtDepth(node, n, 0);
    }
}
