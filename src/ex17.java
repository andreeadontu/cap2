import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Introduceti prima valoare: ");
        num1 = input.nextInt();
        System.out.print("Introduceti a doua valoare: ");
        num2 = input.nextInt();
        System.out.print("Introduceti a treia valoare: ");
        num3 = input.nextInt();
        System.out.printf("Suma este: %d%n", num1 + num2+num3);
        System.out.printf("Media valorilor este: %d%n", (num1 + num2 + num3 ) / 3);
        System.out.printf("Produsul este %d%n", num1*num2*num3);
        if (num1 > num2 && num1>num3)
            System.out.printf("%n%d este cel mai mare", num1);
        if (num1 < num2 && num3<num2)
            System.out.printf("%n%d este cel mai mare", num2);
        if (num1<num3 && num2<num3)
            System.out.printf("%n%d este cel mai mare", num3);
        if (num1 < num2 && num1<num3)
            System.out.printf("%n%d este cel mai mic ", num1);
        if (num1 > num2 && num3>num2)
            System.out.printf("%n%d este cel mai mic", num2);
        if (num1>num3 && num2>num3)
            System.out.printf("%n%d este cel mai mic", num3);
    }
}