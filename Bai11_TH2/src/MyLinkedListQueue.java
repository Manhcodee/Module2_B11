public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue () {

    }

    public MyLinkedListQueue(Node tail, Node head) {
        this.tail = tail;
        this.head = head;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
