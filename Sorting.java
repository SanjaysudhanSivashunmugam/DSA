class Sorting {
    public static void main(String[] args) {
        int arr[] = {8, 5, 9, 3, 1, 0, 2};
        selectionSort(arr);
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            int lowIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[lowIndex]) {
                    lowIndex = j;
                }
            }
            int temp = arr[lowIndex];
            arr[lowIndex] = arr[i];
            arr[i] = temp;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}