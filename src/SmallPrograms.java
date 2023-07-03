import java.util.Arrays;

public class SmallPrograms {

    public static void main(String [] args){

        //fibbonaic_series();
        //System.out.println("countval"+ CountOnes(11));
        //System.out.println("countval"+ reverNumber(123));
       // System.out.println("Value: "+ flipBitwise_Number(5));
       //  int a[]= {3,4,51,2,1};
        //reverseArray(a,5);
       // int a[]= {2,3,1,6,3,6,2};
       // System.out.println("Value: "+uniqueValue(a,7));

        int a[]= { 5,1,2,3,4,2};
         System.out.println("Value: "+duplicateArray(a));
    }


    /** Duplicate in Array
     *
     *given an array ARR of size N containing number between 1 and N-1 at least once.
     * There is a single integer value that is present in the array twice.
     * Task is to find the duplicate integer value present in the array
     *
     * Arr = { 5,1,2,3,4,2}
     * output = 2
     * Explanation: xor all the arrays then xor with the number limit
     *
     */

    static int duplicateArray( int[] arr){
        int duplicateVal = 0;

        for (int i =0; i< arr.length; i++){
            duplicateVal = duplicateVal ^ arr[i] ;
        }

        for (int i = 1; i < arr.length; i++) {
            duplicateVal = duplicateVal ^ i ;
        }

        return duplicateVal;
    }


    /**
     *
     * find unique number in an array where N is equal to (2M+1).
     * Number of elements are present twice and one number is present once
     *
     *
     *
     */

    static int uniqueValue(int[] arr, int n){
       int uniqueVal =0;
        for(int i=0; i<n; i++){
            uniqueVal = uniqueVal ^ arr[i];

        }


       return uniqueVal;

    }


    /**
     *
     * reverse without using whole loop, smart reverse of array
     *
     *
     */

    static void reverseArray(int[] arr , int n){

        int start =0;
        int end = n-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

    /***
     * complemnet an integer number , flip 0 and 1 in an number
     *
     *  5 = 101  to 2 = 010
     *
     */


    static int flipBitwise_Number( int x){
        int ans =0;
        int mask =0;
        int n =x;

        while(n != 0){
            mask = (mask << 1 )| 1;
            n = n>> 1;
        }

        ans = (~x) & mask;
       return ans;
    }


    /**
     *
     * reverse a number and check if its with in the max integer limit otherwise return zero.
     */
     static int reverNumber (int n){
         int ans =0;

         while(n != 0){
             int digit = n %10 ;
             if(ans > (Integer.MAX_VALUE/10 )||   ans < (Integer.MIN_VALUE/10 )){
                return 0;
             }
             ans= (ans * 10)+ digit;
            n = n/10;
         }



         return ans;
     }



    /**
     * unsigned integer number check the number of 1's in it using bitwise operator
     *
     *
     *
     */
 static int CountOnes(int val) {
     int count = 0;
     while (val != 0) {
         if ((val & 1) == 1) {
             count++;
         }
         val = val >> 1;
    }
     return count;
 }

// 0 1 1 2 3 5 8 13 ...
    static void fibbonaic_series(){
       int n = 10;
       int i=1;

       int a = 0;
       int b =1;
       int sum = 0;
        System.out.print("0 1 ");
       while( i <= 10){
           sum = a+b;
           a= b;
           b= sum;
           System.out.print(sum +" ");
           i++;
       }

    }
}
