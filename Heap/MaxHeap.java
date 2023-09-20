import java.util.PriorityQueue;
import java.util.Comparator;

class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // insert elements
        maxHeap.offer(1);
        maxHeap.offer(6);
        maxHeap.offer(9);
        maxHeap.offer(2);
        maxHeap.offer(4);

        // peek max element in heap
        System.out.println("Max element: " + maxHeap.peek());

        // remove and print all elements in heap
        while(!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        System.out.println(maxHeap.isEmpty());
    }
}