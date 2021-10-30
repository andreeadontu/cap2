import java.util.Scanner;
public class ex25 {
    public static void main(String[] args) {
        int num;
        System.out.print("Introduceti variabila:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if ( num % 2 == 0 )
            System.out.println("Numarul este par");
        else
            System.out.println("Numarul este impar");
    }
}