import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *Given an array of integers , return true if the number of occurrences of each value
 *in the array value is unique or false otherwise
 *
 *example:
 *  Input : [1,2,2,1,1,3]
 *  Output: true
 * occurrence of 1 is 3 and of 2 is 2 and of 3 is 1.
 */


public class UniqueOccurence_leetcode_1207 {

    public static void main(String[] args){

        int arr[] = {1,2,2,1,1,3};
        Set val= new HashSet();
        Map mapV =new HashMap();

        for (int i = 0; i < arr.length ; i++) {
            if(!mapV.containsKey(arr[i])){
                mapV.put(arr[i],1);
            }else{
               int tempVal = (int) mapV.get(arr[i]);
                mapV.put(arr[i],++tempVal);
            }
        }
        for (Object key:mapV.keySet()) {
            val.add(mapV.get(key));
        }

        System.out.println( val.size() == mapV.size());

    }
}
