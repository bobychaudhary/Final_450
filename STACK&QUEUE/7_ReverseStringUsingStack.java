import java.util.Stack;

class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        String str="";
        for(int i=0;!stack.isEmpty();i++){
            str+=stack.pop();
        }
        return str;

    }

}