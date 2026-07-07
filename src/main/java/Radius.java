import java.util.Scanner;
public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double area=0;
        System.out.println("Enter the radius of the circle:");
        r = input.nextInt();
        area = Math.PI*r*r;
        System.out.println("The area of circle is =" + area);
    }
}
