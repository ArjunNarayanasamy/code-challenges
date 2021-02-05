package LinkedLists;

public class SinglyLinkedList<T> {

    public class Node {
        public T data;
        public Node pointer;
    }

    public Node headNode;
    public int size;

    public SinglyLinkedList() {
        this.headNode = null;
        this.size = 0;
    }

    public void addElementAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.pointer = headNode;
        headNode = newNode;
        size++;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.headNode == null) return true;
        return false;
    }

    public void printList() {
        if (isEmpty())
            System.out.println("List is Empty!");
        Node node = this.headNode;
        while(node.pointer!=null) {
            System.out.println(node.data);
            node = node.pointer;
        }
    }

}
