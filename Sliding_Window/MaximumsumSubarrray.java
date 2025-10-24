package Sliding_Window;

public class MaximumsumSubarrray {

  public static int maxsum(int[] arr,int k,int n){
    if(n<=k){
      return -1;
    }
    int sum=0;
    for(int i=0;i<k;i++){
      sum+=arr[i];
    }

    int windowsum=sum;
    for(int i=k;i<n;i++){
      windowsum+=arr[i]-arr[i-k];
      sum=Math.max(windowsum,sum);
    }
    return sum;
  }
  public static void main(String[] args){
    // int arr[]={5,2,3,10,3};
    int arr[]={5,-3,-4,6,9,10,25,0};
    int k=3;
    int n=arr.length;
    System.out.println(maxsum(arr,k,n));
  }
}
