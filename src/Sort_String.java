public class Sort_String {

    public static void main(String[] args) {

       System.out.print( sortString (1, 6, "110100"));

    }
    public static int sortString (int testCaseNo , int n , String str){
        int ans =0;
        while (testCaseNo >0) {

            ans = n + 1;
            long zeroLong = str.chars().filter(ch -> ch == '0').count();
            int zero = Math.toIntExact(zeroLong);
            int one = 0;
            if (zero % 2 == 0) ans = zero / 2;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    zero--;
                } else {
                    one++;
                }
                if ((zero + one) % 2 == 0) {
                    ans = Math.min(ans, (zero + one) / 2);
                }
            }
            if (ans > n) {
                ans = -1;
            }
            testCaseNo -= 1;
        }
    return  ans;

    }
}
