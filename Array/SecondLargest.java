public class SecondLargest {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 10};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest is "+secondLargest);
    }
}
