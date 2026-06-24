public class Pascal {
    public static int ncr(int a,int b) {
        int ans = 1; 
          for(int i = 0; i<b; i++){
            ans = ans*(a-i);
            ans = ans/(i+1);



                  }
        return ans;
        
    }
    public static void pasrow() {
        // this solution would take O(n^2) time complexity but it can be solved in O(n) too
        int row = 6;
        int ans = 1;
        // for(int i =1; i<row;i++){
        //     int a = ncr(row-1, i-1);
        //     System.out.println(a);

        // }
        System.out.print("1");
        for(int i=1; i<row; i++){
            ans = ans*(row-i);
            ans = ans/i;
            System.out.print(ans);

        } // this solution would take O(n) time complexity  using that we will print all the rows
        
    }
    public static void main(String[] args) {
          // In first type we would have to find elment where row and column would be given to us 
          // for this we would use combination formula
          // this solution would take O(n) time
          int row = 6;
          int column = 3;
          pasrow();
          
          

    }
    
}
