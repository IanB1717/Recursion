mport java.util.*;

public class Solution {
    public static void main(String args[] ){
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        System.out.println(function(n));
    }

    public static long function(int n){
        if (n == 1) {
            return 2;
        } else {
            return (4 * function(n - 1) - 3 * n);
        }

  //fill in the recursive method

    }
}