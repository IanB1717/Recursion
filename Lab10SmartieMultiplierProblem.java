import java.util.Scanner;
import java.util.*;
public class Lab10SmartieMultiplierProblem
{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > m) {
            System.out.println(m);
        }
        else{
            int answer = posible(n, m);
             if (answer == 0)
              {
            if (n < m)
            {
                System.out.println(n);
            }
            else
             {
                System.out.println(m);
            }
        }
        else {
            if (n > m) {
                System.out.println(n);
            } else {
                System.out.println(m);
            }
        }
        }

    }

    public static int posible(int n, int m) {
        int count = 2;
        int count2 = 2;
        if (((n % 2 != 0) && (m % 2 != 0) )|| (m <= 2 && n <= 2)) {
            return 1;
        } else if (check1(n, count) == true && check2(m, count) == true) {
            return 0;
        }

        else {
            if (check1(n, count) == false) {
                count++;
            }
            if (check2(m, count2) == false) {
                count2++;
            }
            return posible((n / count), (m / count2));
        }

    }

    public static boolean check1(int n, int count) {

        if (n % count == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean check2(int m, int count2) {
        if (m % count2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
