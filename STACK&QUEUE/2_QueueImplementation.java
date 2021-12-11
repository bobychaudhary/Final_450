//Implementation of queue using linked list 
class QueueImplementation {
    ListNode front, rear;
    int size;

    public QueueImplementation() {
        front = rear = null;
        size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = front.data;
            front = front.next;
            size--;
            return data;
        }
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return front.data;
        }
    }
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());
        System.out.println("Dequeued element is " + queue.dequeue());
    }
}