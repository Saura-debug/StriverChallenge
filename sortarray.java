import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int arr1[] = {3,4,5,7};
        int left = 0; 
        int right = 0;
         while(left<arr.length && right<arr1.length){
            if(arr[left]<=arr1[right]){
                left++;
            } else{
                int temp = arr[left];
                arr[left] = arr1[right];
                arr1[right] = temp;
                right++;
            }
         }
         Arrays.sort(arr);
         Arrays.sort(arr1);
    }
    
}
