public class Node {
    int data;
    Node next;
    Node head = null;
    Node tail = null;
    public Node() {

    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public void addNewNode(int data) {
        Node addedNode = new Node(data);

        if (head == null) {
            head = addedNode;
        } else {
            tail.next = addedNode;
        }
        tail = addedNode;
    }

    public void displayList() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("List is empty!");
        }
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

