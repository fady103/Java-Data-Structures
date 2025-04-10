

// Singly Linked List implementation

public class LinkedList {
    Node head;

    // 1. Add a node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 2. Add a node at the beginning
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3. Insert a node at a specific index
    public void insertAt(int index, int data) {
        if (index == 0) {
            prepend(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index!");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // 4. Delete the first node
    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    // 5. Delete the last node
    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // 6. Delete a node at a specific index
    public void deleteAt(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Invalid index!");
            return;
        }

        current.next = current.next.next;
    }

    // 7. Search for a value in the list
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    // 8. Print all nodes in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
