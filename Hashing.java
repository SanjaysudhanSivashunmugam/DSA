import java.util.HashMap;

class Hashing {
    public static void main(String[] args) {
        int arr[] = {1, 3, 1, 4, 3, 7, 9, 8, 12, 12, 3};

        HashMap<Integer, Integer> hm = new HashMap<>();

        int maxKey = arr[0];
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }

            if (maxValue < hm.get(arr[i])) {
                maxKey = arr[i];
                maxValue = hm.get(arr[i]);
            }
        }

        System.out.println(maxKey + " " + maxValue);
    }
}