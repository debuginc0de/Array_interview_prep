package MissingNumber;

public class missingNumber {
    public static int missnumber(int []number,int n){
        int expected=n*(n+1)/2;
        int sum=0;
        for(int num:number){
            sum+=num;
        }
        return expected-sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};
        int answer=missnumber(arr,9);
        System.out.println(answer);
    }
}
