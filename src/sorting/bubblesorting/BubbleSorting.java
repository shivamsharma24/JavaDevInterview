package sorting.bubblesorting;

//Time Comp-> o(n2)
//Space Comp-> o(1)
public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1};

        int[] arrr = bubble(arr);
       for(int num:arrr){
           System.out.print(num+" ");
       }
    }
    public static int[] bubble(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
