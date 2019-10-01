import java.util.Scanner;

public class ApcsaTrap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your trapezoid's top length? ");
        final double TOP = in.nextDouble();
        System.out.print("What is your trapezoid's bottom length? ");
        final double BOTTOM = in.nextDouble();
        System.out.print("What is your trapezoid's height? ");
        final double HEIGHT = in.nextDouble();
        double area = ((TOP + BOTTOM) / 2) * HEIGHT;
        System.out.print("The area of the trapezoid is ");
        System.out.printf("%.1f.", area);

        in.close();
    }
}
