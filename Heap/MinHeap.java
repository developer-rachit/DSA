import java.util.PriorityQueue;

class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<String> minHeap = new PriorityQueue();

        //insert new elements
        minHeap.offer("apple");
        minHeap.offer("banana");
        minHeap.offer("mango");
        minHeap.offer("grapes");
        minHeap.offer("papaya");

        // get min element
        String minElement = minHeap.peek();
        System.out.println("Min element: " + minElement);

        // remove and print all elements of heap
        while(!minHeap.isEmpty()) {
            String element = minHeap.poll();
            System.out.print(element + " "); //apple banana grapes mango papaya true
        }

        System.out.println(minHeap.isEmpty());
    }
}