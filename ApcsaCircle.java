import java.util.Scanner;

public class ApcsaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your circle's diameter? ");
        final double DIAMETER = in.nextDouble();
        double radius = DIAMETER / 2;
        double area = Math.PI * (radius * radius);
        System.out.print("The area of a circle with a diameter of ");
        System.out.printf("%.1f is " , DIAMETER); //the "displaying only one number after the decimal" thing isn't working even though it should
        System.out.print(area);

        in.close();
    }
}
