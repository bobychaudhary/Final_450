import java.util.Stack;
class solution{
    static Stack<Character> stack=new Stack<>();
    static void insert_at_bottom(char x){
        if(stack.isEmpty()){
            stack.push(x);
        }
        else{
            char a=stack.peek();
            stack.pop();
            insert_at_bottom(x);
            stack.push(a);
        }
    }
    static void reverse(){
        while(!stack.isEmpty()){
            char a=stack.peek();
            stack.pop();
            reverse();
            insert_at_bottom(a);
        }
    }
}