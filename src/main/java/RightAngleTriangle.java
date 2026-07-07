import java.util.Scanner;
public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line,star,n;
        System.out.println("Enter a number:");
        n = input.nextInt();
        for(line=1;line<=n;line++){
            for(star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
