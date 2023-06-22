import java.util.Arrays;

/** Dutch National flag problem also known as
 *You are given an array consisting of zeros , ones and twos
 **sort the array in same order , don't create new array
 *Input
 *   n- the size of array
 *   arr - the array itself
 * output
 *  A sorted Array
 *
 * Constraints:
 *      1<= n <= 100
 *      0<= arr[j] <= 2
 *
 *  Not using sorting algorithm
 */


public class Sort_0_1_2 {

    /*public static void main(String[] args) {

        int valTemp[] ={1,0,1,0,1,1};

        int[] temp = sort_it( valTemp, 6);
        System.out.println(Arrays.toString(temp));
    }*/


    public static int[] sort_it(int[] arr , int n){
        System.out.println(Arrays.toString(arr)+" n :"+ n);

        int l_bound =0;
        int r_bound = n-1;
        int i=0;
        while ( i <= r_bound){

            if(arr[i] ==2 ){
                arr[i] = arr[r_bound];
                arr[r_bound] =2 ;
                r_bound -= 1;
            }else if(arr[i] ==1 ){
                i += 1;
            }else{
                arr[i] = arr[l_bound];
                arr[l_bound] =0;
                l_bound += 1;
                i += 1;
            }

        }


        return arr;
    }

}
