import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduceti prima valoare: ");
        num1 = input.nextInt();
        System.out.print("Introduceti a doua valoare: ");
        num2 = input.nextInt();
        System.out.printf("Suma este %d%n", num1 + num2);
        System.out.printf("Produsul este %d%n", num1*num2);
        System.out.printf("Diferenta este %d%n", num1 - num2);
        System.out.printf("Diviziunea este %d%n", num1 / num2);
    }
}
