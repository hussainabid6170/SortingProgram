/**
 *
 *
 *          1
 *        1 2 1
 *      1 2 3 2 1
 *    1 2 3 4 3 2 1
 *
 *    Implementation : blank inverted right triangle + second  right triangle + third right triangle
 *
 */





public class String_Pyramid {

    public static void main (String[] args){

        int n =4;
        int rows =1;
        while( rows <= n){

            //first triangle n-i
            int space = n-rows;
            while(space > 0){
                System.out.print(" ");
                space = space -1;
            }

            //right triangle
            int j = 1;
            while(j<= rows){
                System.out.print(j);
                j++;
            }
            //third triangle
            int k = rows-1;
            while(k > 0){
                System.out.print(k);
                k--;
            }


            rows++;
            System.out.println();
        }



    }
}
