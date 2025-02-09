# Stack in Java
## Stack using Array
```java
class Stack {
    int size = 30;
    int arr[] = new int[size];
    int top;
    
    Stack() {
        top = -1;
    }
    
    void push(int data) {
        if(top == size - 1) {
            System.out.println("Stack overflow");
        }
        arr[++top] = data;
    }
    
    int pop() {
        if(top == -1) {
            System.out.println("Stack underflow");
        }
        return arr[top--];
    }
    
    int peek() {
        return arr[top];
    }
    
    boolean isEmpty() {
        return top == -1;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
	}
}
```

## Stack using Linked List

```java
class Stack {
    Node top;
    
    class Node {
        int data;
        Node next;
        
        Node(int val) {
            data = val;
            next = null;
        } 
    }
    Stack() {
        top = null;
    }
    
    void push(int val) {
        Node nn = new Node(val);
        if(top == null) {
            top = nn;
        }
        else {
            nn.next = top;
            top = nn;
        }
    }
    
    int pop() {
        int temp = top.data;
        top = top.next;
        return temp;
    }
    
    int peek() {
        return top.data;
    }
    
    boolean isEmpty() {
        return top == null;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
	}
}
```
