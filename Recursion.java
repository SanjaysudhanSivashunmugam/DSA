class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(5,0));
    }

    public static int sum(int n, int s) {
        if(n < 1) {
            return s;
        }
        return sum(n - 1, s + n);
    }
}