import java.util.Scanner;

public class calculate_mean {
    public static void main(String[] args) {
        /*1st number */
       Scanner num = new Scanner(System.in);
       System.out.println("enter the 1st num:- ");
       int num1 = num.nextInt();
       System.out.println(num1);

        /*2nd number */

       Scanner num2 = new Scanner(System.in);
       System.out.println("enter the 2nd num:- ");
       int num3 = num.nextInt();
       System.out.println(num3);

        /*3rd number */

       Scanner num5 = new Scanner(System.in);
       System.out.println("enter the 3rd num:- ");
       int num6 = num.nextInt();
       System.out.println(num6);

       float average = (num1 + num3 + num6) / 3;
       System.out.println("Mean:- " + average);

       num.close();
       num2.close();
       num5.close();
    }
}
