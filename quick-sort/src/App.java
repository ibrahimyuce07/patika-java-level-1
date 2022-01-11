public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int p = partition(arr, i, j);
            quickSort(arr, i, p - 1);
            quickSort(arr, p + 1, j);
        }
    }

    private static int partition(int[] arr, int i, int j) {
        int pivot = arr[j];
        int p = i;
        for (int k = i; k < j; k++) {
            if (arr[k] < pivot) {
                swap(arr, p, k);
                p++;
            }
        }
        swap(arr, p, j);
        return p;
    }

    private static void swap(int[] arr, int p, int k) {
        int temp = arr[p];
        arr[p] = arr[k];
        arr[k] = temp;
    }
}
