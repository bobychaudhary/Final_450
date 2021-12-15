
// Implement a method to insert an element at its bottom without using any other data structure.
class solution extends Stack {
    static void inset_at_bottom(char x){
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
public static void main(String[] args) {
    
}
}