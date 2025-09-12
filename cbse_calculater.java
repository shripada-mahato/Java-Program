import java.util.Scanner;;
public class cbse_calculater {
    public static void main(String[] args) {
        Scanner cal1 = new Scanner(System.in);
        System.out.print("Enter all Subject mark :- \n1st Subject :- ");
        float a = cal1.nextInt();
        System.out.println(a);
        Scanner cal2 = new Scanner(System.in);
        System.out.print("2nd Subject:- ");
        float b = cal2.nextInt();
        System.out.println(b);
        Scanner cal3 = new Scanner(System.in);
        System.out.print("3rd Subject:- ");
        float c = cal3.nextInt();
        System.out.println(c);
        Scanner cal4 = new Scanner(System.in);
        System.out.print("4th Subject:- ");
        float d = cal4.nextInt();
        System.out.println(d);
        Scanner cal5 = new Scanner(System.in);
        System.out.print("5th Subject:- ");
        float e = cal1.nextInt();
        System.out.println(e);
        float sum = a+b+c+d+e;
        System.out.println("Your Total Mark is:- "+sum);
        float percentage = (sum / 500) * 100;
        System.out.println("Your Percentage is:- "+percentage+"%");
        cal4.close();
        cal3.close();
        cal1.close();
        cal2.close();
        cal5.close();
    }
    
}
