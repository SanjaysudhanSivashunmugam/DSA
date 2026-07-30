class Main {
    public static void main(String[] args) {
        int n = 3;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
    }

    public static void pattern1(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            } 

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for(int i = 0; i < 2 * n - 1; i++) {
            int star = i;
            if(i >= n) {
                star = 2 * n - i - 2;
            }

            for(int j = 0; j <= star; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for(int i = 0; i < n; i++) {
           int number = (i % 2 == 0) ? 1 : 0;
            for(int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = 1 - number;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int space = 2 * (n - 1);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space -= 2;

            for(int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
