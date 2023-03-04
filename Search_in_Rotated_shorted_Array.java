
public class Search_in_Rotated_shorted_Array {
    
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int left=0, right=arr.length-1, tg=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==tg){
                System.out.println(mid);
                break;
            }
            if(arr[left]<arr[mid]){
                if(tg>=arr[left] && tg<=arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(tg>=arr[mid] && tg<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                    
                }
            }
        }
        if(left>right){
            System.out.println(-1);
        }
    }
}