public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {34, 23, 435, 93, 20};

        selectionsort(arr);

        for(int n : arr) {
            System.out.println(n + " ");
        }
    }

    private static void selectionsort(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}