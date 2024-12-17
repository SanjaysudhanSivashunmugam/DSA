class GfG {
    int minEle = Integer.MAX_VALUE; 
    Stack<Integer> s;
    
    // Constructor
    GfG() {
        s = new Stack<>();
    }
    
    int getMin() {
        if (s.isEmpty()) {
            return -1; 
        }
        return minEle;
    }
    
    int pop() {
        if(s.isEmpty()){
            return -1;
        }
        int x = s.pop();
        if(x < minEle){
            int temp = minEle;
            minEle = 2 * minEle - x;
            return temp;
            }
       return x;
    }
    
   
    void push(int x) {
        if(s.isEmpty()){
            s.push(x);
            minEle = x;
        }
        else{
            if(x > minEle){
                s.push(x);
            }
            else{
                s.push(2 * x - minEle);
                minEle = x;
            }
        }
    } 
}

