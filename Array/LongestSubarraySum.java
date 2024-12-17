public class LongestSubarraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 1, 1, 1 ,1};
        // printSubArray(arr);
        System.out.println(methodOne(arr, 4));
    }

    public static void printSubArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static int methodOne(int arr[], int v) {
        int sum = 0, length = 0;
        for (int i = 0; i < arr.length; i++){
            sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == v){
                    length = Math.max(length, j - i + 1);
                }
            }

        }
        return length;
    }
    // public static int methodTwo() {
    // }
}
