import java.util.Arrays;

public class colorsort {
    public static void sort(int arr[]) {
        int zero = 0; 
        int one = 0; 
        int two = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] ==0){
                zero++;
            }
        
            else if(arr[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }
        System.out.print(zero);
        System.out.print(one);
        System.out.print(two);
        int a = 0;
        for(int i =0; i<zero; i++){
            arr[a]=0;
            a++;
        }
        System.out.print(a);
        for(int i =0;i<one;i++){

            arr[a] = 1;
            a++;
        }
        System.out.print(a);
        for(int i = 0; i<two;i++){
            arr[a] = 2;
            a++;
        }
        System.out.print(Arrays.toString(arr));
        
    }
    
    public static void main(String[] args) {
        // first brute force solution would be by sorting function which i don't intend to solve right now and probably would take NlogN time complexity
        // better solution would be done by counting zero,one,two and then counting every number.
        // just override every count to its counting in original array 
        // her you will have TC(2N) but using Dutch national flag algorithim which states three pointers 
        // low,mid and high where from 0 to low-1 zero would be stored and from low to mid-1 would store 1 and then from mid to high there would be uncertainties afterwords from high+1 to n-1 there would be 222;
        int arr[] = {0,0,1,1,2,1};
        sort(arr);

        




    }
}
