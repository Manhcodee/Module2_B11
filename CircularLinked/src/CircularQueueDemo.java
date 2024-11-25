public class CircularQueueDemo {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public class Queue {
        private Node front;
        private Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }


        public void enQueue(int value) {
            Node temp = new Node(value);

            if (front == null) {
                front = temp;
                rear = temp;
                rear.link = front;
            } else {
                rear.link = temp;
                rear = temp;
                rear.link = front;
            }
        }

        public int deQueue() {
            if (front == null) {
                System.out.println("Hàng đợi rỗng!");
                return -1;
            }

            int value;
            if (front == rear) {
                value = front.data;
                front = null;
                rear = null;
            } else {
                value = front.data;
                front = front.link;
                rear.link = front;
            }
            return value;
        }
        // Hàm hiển thị các phần tử trong hàng đợi
        public void displayQueue() {
            if (front == null) { // Nếu hàng đợi rỗng
                System.out.println("Hàng đợi rỗng!");
                return;
            }

            Node temp = front;
            System.out.print("Các phần tử trong hàng đợi: ");
            do {
                System.out.print(temp.data + " ");
                temp = temp.link;
            } while (temp != front);
            System.out.println();
        }

        public void main(String[] args) {
            Queue queue = new Queue();

            queue.enQueue(14);
            queue.enQueue(22);
            queue.enQueue(-6);


            queue.displayQueue();


            System.out.println("Phần tử bị xóa: " + queue.deQueue());
            System.out.println("Phần tử bị xóa: " + queue.deQueue());

            queue.displayQueue();

            queue.enQueue(9);
            queue.enQueue(20);

            queue.displayQueue();
        }
    }

}
