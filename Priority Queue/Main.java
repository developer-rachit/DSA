
//Node class
class Node<T> {
    T data;
    int priority;
    Node<T> next;

    public Node(T data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

//PriorityQueue class
class PriorityQueue<T> {
    private Node<T> head;

    public PriorityQueue() {
        head = null;
    }

    public void enqueue(T data, int priority) {
        Node<T> newNode = new Node<>(data, priority);

        if(head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> currNode = head;

            while(currNode.next != null && currNode.priority <= priority) {
                currNode = currNode.next;
            }

            newNode.next = currNode.next;
            currNode.next = newNode;
        }
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty", null);
        }

        T data = head.data;
        head = head.next;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

//Driver class
class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.enqueue("Task A", 3);
        pq.enqueue("Task B", 1);
        pq.enqueue("Task C", 2);

        while(!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }
    }
}

