# Print all Divisors
```
Input: 36
output: 1 36 2 18 3 12 4 9 6 
```
```java
class Math {
    public static void main(String[] args) {
        int number = 36;
        for(int i = 1; i * i <= number; i++) { // Runs 1 - sqrt(N)
            if(number % i == 0) {
                System.out.print(i + " ");
                if(i != number / i) {
                    System.out.print(number / i + " ");
                }
            }           
        }
    }
}
```