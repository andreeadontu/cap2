import java.util.Scanner;
public class ex28 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.print("Raza = ");
        r = input.nextInt();
        System.out.printf("Diametrul = %d%n", 2*r);
        System.out.printf("Circumferinta = %f%n", 2*Math.PI*r);
        System.out.printf("Aria = %f%n", Math.PI*r*r);
    }
}
