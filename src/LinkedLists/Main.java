package LinkedLists;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        System.out.println(sll.isEmpty());

        sll.addElementAtHead(12);
        sll.addElementAtHead(33);
        sll.addElementAtHead(12);
        sll.printList();
        System.out.println(sll.getSize());
    }
}
