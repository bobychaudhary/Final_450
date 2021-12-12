

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] res=new long[n];        
        Stack<Long> stack=new Stack<>();
        stack.push(arr[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            
            else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    } 
}