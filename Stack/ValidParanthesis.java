class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char i: s.toCharArray()){
            if(i == '{') {
                st.push('}');
            }
            else if(i == '(') {
                st.push(')');
            }
            else if(i == '[') {
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != i){
                return false;
            }
        }
        return st.isEmpty();
    }
}
