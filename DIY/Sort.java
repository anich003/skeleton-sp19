public class Sort {
    public static void Swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void SelectionSort(int[] ints) {
        for(int i=0; i<ints.length-1; i++) {
            int min_index = i;
            for(int j=i+1; j<ints.length; j++) {
                if (ints[j] < ints[i])
                    min_index = j;
            }
            Sort.Swap(ints, i, min_index);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 3, 1, 0};
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
        SelectionSort(arr);
        for(int i : arr)
            System.out.print(i + " ");

    }
}
