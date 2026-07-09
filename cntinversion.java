public class cntinversion {
    public static void Merge(int low,int mid,int high,int arr[]) {
        while (low<mid && mid+1<=high) {
            if(arr[low]>arr[mid+1]){
                int temp = arr[low];
                arr[low] = arr[mid+1];
                arr[mid+1] = temp;
                low++;
            }else{
                mid++;
                low++;
            } 
         

            
        }
        while (low<=mid) {
            
            
        }
        
    }
    public static void sort(int low,int high, int arr[]) {
        if(low == high){
            return;
        }
        int mid = (high+low)/2;
        sort(low,mid,arr);
        sort(mid+1, high, arr);
        Merge(low,mid,high,arr);
        
     
   

        
    }
    public static void main(String[] args) {
        

        int arr[] = {5,6,4,3};
        int low = 0;
        int high = arr.length-1;
        
        sort(low,high,arr);
        // int cnt = 0;
        // for(int i =0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i]>arr[j]){
        //             cnt++;
        //         }
        //     }
        // }

    }
    
}
