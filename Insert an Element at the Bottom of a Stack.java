Problem Of The Day

24 March

Insert an Element at the Bottom of a Stack

Easy java sol

  class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> newStack=new Stack<Integer>();
        while(!st.empty()){
            newStack.push(st.pop());
        }
        st.push(x);
        while(!newStack.empty()){
            st.push(newStack.pop());
        }
        return st;
    }
}
