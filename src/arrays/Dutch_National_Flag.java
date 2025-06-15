package arrays;

public class Dutch_National_Flag {
    public static void dutchNationalFlag(int[] arr){
        int low=0;int high=arr.length-1;int mid=0;
        //int i=0;
        while(mid<=high){
            if (arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1){
                    mid++;
            }
            else {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;

            }
        }
        //return low;
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,2,2,1,0,1};
        dutchNationalFlag(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
