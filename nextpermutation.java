import java.util.Arrays;

public class nextpermutation {
    public static int  cut(int arr[]) {
        int ind = -1;
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                ind = arr[i];
                break;
            }

        }
        return ind;
        
        
    }
    public static void swap(int a,int b,int arr[]){
        int temp = arr[a];
       arr[a] = arr[b];
        arr[b] = temp; 

 }
 public static int grthancut(int arr[],int a) {
    int l = 0;
    for(int i = arr.length-1; i>=0; i--){
        if(arr[i]>a){
             l = i;
            break;
            

        }
    }
    return l;
    
 }
    public static void rev(int arr[],int a,int b){
        
        while (a<=b) {
            if(arr[a]>=arr[b]){
                swap(a,b,arr);
                a++;
                b--;

            }else {
                a++;
            }
            
            
        }
    }
    public static void main(String[] args) {
        // to find the all the permutation using the the ds
        int arr[] = {1,2,3};
    
        if(cut(arr) == -1){
            rev(arr,0,arr.length-1);
            System.out.print(Arrays.toString(arr));
            return;
            
           

        }else{
            int br = cut(arr);
           int gr = grthancut(arr, br);
        swap(br,gr, arr);

        rev(arr,br+1,arr.length-1);
        System.out.print(Arrays.toString(arr));

        }
        


        
        
    }
    
}
