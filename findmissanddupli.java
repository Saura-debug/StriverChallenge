public class findmissanddupli {
    public static void main(String[] args) {
        // this solutio would take O(n^2) time complexity
        // int rep = 0;
        // int mis = 0; 
        int arr[] = {1,3,4,2,2};
        // for(int i = 1; i<=arr.length; i++){
        //     int cnt = 0; 
        //     for(int j = 0; j<arr.length; j++){
        //         if(arr[j]==i){
        //             cnt++;
        //         }

        //     }
        //     if(cnt==2){
        //         rep = i;

        //     }
        //     if(cnt == 0){
        //         mis = i;
        //     }

        // }
        // System.out.print(rep);
        //   System.out.print(mis);
        // int arr1[] = new int[arr.length+1];
        // for(int i =0;i<arr.length; i++){
        //     // it would take the SC O(n+1) and TC (2n)approx
        // arr1[arr[i]]++;
        // }
        // for(int i = 1; i<arr1.length; i++){             
        //     if(arr1[i]==2){
        //         System.out.print("gotcha the repetetive one "+i);
        //     }
        //     if(arr1[i]==0){
        //         System.out.print("gotcha the missing one "+i);
        //     }
        // }
        // int n = arr.length;
        // long s1 = n*(n+1)/2;
        // long s2 = 0;
        // for(int i = 0; i<arr.length; i++){
        //     s2+=arr[i];
        // }
        // long equ1 = s1-s2;
        // long s3 = (n*(n+1)*((2*n)+1))/6;
        // long s4 = 0; 
        // for(int i = 0; i<arr.length; i++){
        //     s4+=arr[i]*arr[i];
        // }
        // long equ2 = (s3-s4)/equ1;
        // int x = (int)(equ1+equ2)/2;
        // int y = x-(int)equ1;
        // System.out.println(x);
        // System.out.print(y);
        int xr = 0;
        for(int i =0;i<arr.length; i++ ){
            xr = xr^arr[i];
            xr = xr^i+1;
        }
        int bit = 1;
        while((xr&bit)!=1){
                  bit = bit<<1;
            
            
        }
        int a = 0;
        int b = 0;
        for(int i = 0;i<arr.length; i++){
            if((arr[i] &1<<bit) == 0 ){
                a = a^arr[i];
            }else{
                b = b^arr[i];
            }

            if((i+1 & 1<<bit) ==0){
                a = a^i+1;
            }else{
                b = b^i+1;
            }
        }
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==a){
                cnt++;
            }
            
        }
        if(cnt ==0){
            System.out.print("missing" + a);
            System.out.print("repetetive" + b);
            
        } else{
               System.out.print("missing" + b);
            System.out.print("repetetive" + a);
            
        }


    
}}
