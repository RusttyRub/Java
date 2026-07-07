import java.util.Scanner;
public class Ulto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int line,star;
        for(line=n; line>=1;line--){
            for(star=line;star>=1;star--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
