/**
 *  Maximum sub array ---Kadane Algorthm
 *
 *  given an array nums , find the contingious sub array(containing at least one element)
 *  which has the largest sum and return its sum,
 *
 *  Input = {-2,1,-3,4,-1,2,1,-5,4}
 *  Output = 6
 *  explanation = {4,-1,2,1} has the largest sum 6
 *
 *  Kadane Algo
 *  Initially   sum= 0 ,maxi =-2
 *  sum = sum + arr[i]
 *  maxi = max(maxi ,sum)
 *  if (sum < 0) then sum = 0
 */


public class Max_subArray_Kadane_Algo {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int maxi = -2;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0)
                sum =0;
        }

        System.out.println(maxi);
    }

}
