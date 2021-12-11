import java.util.EmptyStackException;

class Middle extends Stack {
    public int findMiddle(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        ListNode slow=top;
        ListNode fast=top;
        while(slow!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}