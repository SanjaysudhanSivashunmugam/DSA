class Stack {
    Node head;
    int size = 0;
    class Node {
        int data;
        int min;
        Node next;
        Node(int v) {
            data = v;
            min = v;
            next = null;
        }
    }
    Stack() {
        head = null;
    }
    void push(int v) {
        Node nn = new Node(v); 
        size++;
        if(head == null){
            head = nn;
        }
        else{
            if(head.min < nn.min){
              nn.min = head.min;
            }
            nn.next = head;
            head = nn;
        }
    }
    void pop(){
        if(head == null) {
            return;
        }
        head = head.next;
        size--;
    }
    void peek(){
        System.out.println(head.data);
    }
    void Size(){
        System.out.println(size);
    }
    void getMin() {
        System.out.println(head.min);
    }
}
public class Main
{
	public static void main(String[] args) {
	Stack s = new Stack();
	s.push(4);
	s.getMin();
	s.push(3);
	s.getMin();
	s.push(2);
	s.getMin();
	s.push(1);
	s.getMin();
	}
}