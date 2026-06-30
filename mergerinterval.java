import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergerinterval {
public static void main(String[] args) {
    int arr[][] = {{1,3},{2,6},{4,8},{9,10}};
    List<List<Integer>> ls = new ArrayList<>();
//    ls.add(Arrays.asList(arr[0][0],arr[0][1]));
//    int last = ls.get(ls.size()-1).get(1);
//    for(int i = 0; i<arr.length; i++){
//     if(i>0){
//         if(last>=arr[i][1]){
//             continue;
//         } else{
//             ls.add(Arrays.asList(arr[i][0],arr[i][1]));
//             last = Math.max(last,arr[i][1]);
//         }
//     }
//     for(int j = i+1; j<arr.length; j++){
//         if(last>=arr[j][0]){
//              last = Math.max(last,arr[j][1]);
//             ls.get(ls.size()-1).set(1,last);
           

//         } else {
//             break;
//         }
//     }
    

//    }

int last = 0; 
for(int i = 0; i<arr.length; i++){
    if(ls.size()<1){
        ls.add(Arrays.asList(arr[i][0],arr[i][1]));
        last = arr[i][1];
    }
    else {
        if(last>=arr[i][0]){
            last = Math.max(last,arr[i][1]);
            ls.get(ls.size()-1).set(1,last);

        } else{
            ls.add(Arrays.asList(arr[i][0],arr[i][1]));
            last = arr[i][1];
        }
    }
}
  System.out.print(ls);

   
}
    
}
