import java.util.*;

class MyHashMap {
    private static class Node {
        int key, value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }

    private int SIZE = 10;
    private Node[] table = new Node[SIZE];

    void put(int key, int value) {
        int idx = key % SIZE;
        Node newNode = new Node(key, value);
        if (table[idx] == null) table[idx] = newNode;
        else {
            Node temp = table[idx];
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    Integer get(int key) {
        int idx = key % SIZE;
        Node temp = table[idx];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return null;
    }

    void remove(int key) {
        int idx = key % SIZE;
        Node temp = table[idx], prev = null;
        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) table[idx] = temp.next;
                else prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 100);
        map.put(11, 200);
        System.out.println(map.get(11));
        map.remove(1);
    }
}
