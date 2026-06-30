import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int arr[] = {5,3,0,8,2,1};
        for(int i = 1; i<arr.length; i++){
            int j = i;
            int temp = arr[j];
            
                while ( j>0 && temp<arr[j-1] ) {
                    
                arr[j]=arr[j-1];
                j--;
                if(j-1<0){
                    break;
                }
                
            
            arr[j]=temp;


            }
            

        }
        System.out.print(Arrays.toString(arr));
    }
    
}
