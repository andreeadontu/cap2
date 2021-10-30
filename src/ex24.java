import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        System.out.print("Introduceti prima valoare: ");
        num1 = input.nextInt();
        System.out.print("Introduceti a doua valoare: ");
        num2 = input.nextInt();
        System.out.print("Introduceti a treia valoare: ");
        num3 = input.nextInt();
        System.out.print("Introduceti a patra valoare: ");
        num4 = input.nextInt();
        System.out.print("Introduceti a cincea valoare: ");
        num5 = input.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
            System.out.printf("%n%d este cel mai mare", num1);
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
            System.out.printf("%n%d este cel mai mare", num2);
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
            System.out.printf("%n%d este cel mai mare", num3);
        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
            System.out.printf("%n%d este cel mai mare", num4);
        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
            System.out.printf("%n%d este cel mai mare", num5);
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
            System.out.printf("%n%d este cel mai mic", num1);
        if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
            System.out.printf("%n%d este cel mai mic", num2);
        if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
            System.out.printf("%n%d este cel mai mic", num3);
        if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
            System.out.printf("%n%d este cel mai mic", num4);
        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)
            System.out.printf("%n%d este cel mai mic", num5);

    }
}
