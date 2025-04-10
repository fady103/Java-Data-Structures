public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // All Ading Operations
        list.append(10);
        list.append(20);
        list.prepend(5);
        list.insertAt(1, 15); // After elment(5) 

        // Print the list after adding elements
        System.out.print("List after adding: ");
        list.printList(); // 5 -> 15 -> 10 -> 20 -> null

        // Deleting Operations
        list.deleteFirst();     // Delete 5
        list.deleteLast();      // Delte 20
        list.deleteAt(1);       // Delete 10

        // Print the list after deletions
        System.out.print("List after deletion: ");
        list.printList(); // 15 -> null

        // Search Operations
        System.out.println("Is 15 present? " + list.search(15)); // true
        System.out.println("Is 99 present? " + list.search(99)); // false
    }
}
