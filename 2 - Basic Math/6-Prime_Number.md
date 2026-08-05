# Check Prime
```
Input: 7
output: true 
```
```java
class Math {
    public static void main(String[] args) {
        int number = 7;
        int count = 0;
        for(int i = 1; i * i <= number; i++) { // Runs 1 - sqrt(N)
            if(number % i == 0) {
                count ++;
                if(i != number / i) {
                    count ++;
                }
            }           
        }
        if (count > 2) {
            System.out.println(false);
        }

        else {
            System.out.println(true);
        }
    }
}
```