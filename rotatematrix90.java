import java.util.Arrays;

public class rotatematrix90 {
    public static void swap(int a,int b,int arr[][]) {
        int temp = arr[a][b];
        arr[a][b] = arr[b][a];
        arr[b][a] = temp;

        
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int arr1[][] = new int[arr.length][arr[0].length];

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr[0].length; j++){
        //         arr1[j][arr.length-1-i] = arr[i][j];
        //     }
        // }
        // System.out.print(Arrays.deepToString(arr1));
        // this is the bruteforce solution where we used n-1-i formula for the column
        // it took the SC(n^2) and TC O(n^2) which is not good that's we will solve it without using the space.

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr[0].length; j++){
                swap(i, j, arr);
                
            }
        }
        System.out.print(Arrays.deepToString(arr));
       for(int i = 0; i<arr.length; i++){
        int s = 0;  
        int e = arr[0].length-1;
        while (s<e) {
            int temp = arr[i][s];
             arr[i][s] = arr[i][e];
             arr[i][e] = temp;
             s++;
             e--;
            
        }
       }
       // solved with the O(n^2) time-complexity 
       System.out.print(Arrays.deepToString(arr));

    }
    
}
