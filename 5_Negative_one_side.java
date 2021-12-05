// Move all the negative elements to one side of the array

class solution{
    public static void rearrange(int[] arr){
        int j=0;
        int  temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }

        }
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        solution obj=new solution();
        int[] arr={-1,2,3,-4,5,-6,7,8,-9};
        obj.rearrange(arr);
        print(arr);

    }
}