import java.util.Arrays;

public class Setmatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,0},{3,0,8,7},{1,9,1,7}};
        boolean mat[][] = new boolean[arr.length][arr[0].length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] ==0 ){
                    mat[i][j] = true;
                }
            }
        }
        System.out.print(Arrays.deepToString(mat));
         for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(mat[i][j] == true ){
                    for(int l = 0; l<arr.length;l++){
                        arr[l][j] = 0;
                    }
                    for(int l = 0; l<arr[0].length;l++){
                        arr[i][l] = 0;
                    }
                    
                    
                    
                }
            }
        }
        System.out.print(Arrays.deepToString(arr));
       
    
}

    
}
