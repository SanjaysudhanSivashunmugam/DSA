class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        long minimum = Integer.MAX_VALUE;
        long maximum = Integer.MIN_VALUE;
        for(long i : arr) {
            if(minimum > i) {
                minimum = i;
            }
            if(maximum < i) {
                maximum = i;
            }
        }
        return new Pair<>(minimum, maximum);
        
    }
}