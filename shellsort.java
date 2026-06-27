import java.util.Arrays;

public class shellsort {
    public static void main(String[] args) {
        int arr[] = {5,3,0,8,2,1};
        int n = arr.length; 
        int gap = n/2;
        while(gap>0){
            for(int i = gap; i<n; i++){
            int temp = arr[i];
            int j = i;
            while (j-gap>=0 && arr[j-gap]>temp) {
                arr[j] = arr[j-gap];
                j-=gap;


                
            }
            arr[j] = temp;
        }
        gap = gap/2;

        }
        
        System.out.print(Arrays.toString(arr));
    
}
}