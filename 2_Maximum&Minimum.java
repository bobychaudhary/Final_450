// find the maximum and minimum element in the array
class solution{
    public void maximum(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
            System.out.println("Minimum element is "+min);
            System.out.println("Maximum element is "+max);
        

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        solution ob=new solution();
        ob.maximum(arr);
       
        
    }
}