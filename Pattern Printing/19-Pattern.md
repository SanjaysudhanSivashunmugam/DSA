# Pattern 19

```
E 
D E 
C D E 
B C D E 
A B C D E 
```

```
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            
            char c =(char) ('E' - i) ;
            for(int j = 0; j <= i; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }
}
```