import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduceti prima valoare: ");
        num1 = input.nextInt();
        System.out.print("Introduceti a doua valoare: ");
        num2 = input.nextInt();
        if (num1 > num2)
            System.out.printf("%d este mai mare", num1);
        if (num1 < num2)
            System.out.printf("%d este mai mare", num2);
        if (num1 == num2)
            System.out.printf("valorile sunt egale", num1, num2);
    }
}
