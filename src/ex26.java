import java.util.Scanner;
public class ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduceti prima valoare: ");
        num1 = input.nextInt();
        System.out.print("Introduceti a doua valoare: ");
        num2 = input.nextInt();
        if(number(num1, num2)){
            System.out.println(num1 + " este multiplul lui " + num2);
        }
        else{
            System.out.println(num1 + " nu este multiplul lui " + num2);
        }

    }
    public static boolean number(int num1, int num2){
        if((num1%num2)==0)
            return true;
        else
            return false;

    }
}