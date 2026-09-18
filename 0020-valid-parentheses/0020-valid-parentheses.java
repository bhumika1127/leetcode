class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack();
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c== '(' || c=='{' || c== '['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char peek=st.peek();
                if((c==')'&& peek!='(') || (c== '}' && peek != '{') || (c== ']' && peek != '[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.size()==0;
        
    }
}