# Insertion  Sort
```
0 1 2 3 5 8 9
```
```java
class Sorting {
    public static void main(String[] args) {
        int arr[] = {8, 5, 9, 3, 1, 0, 2};
        insertionSort(arr);
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j] ) {
                int temp =  arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```