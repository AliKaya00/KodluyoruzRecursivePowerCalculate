import java.util.Scanner;

public class RecursivePower {
    static int calculate(int numberal, int power){
      if (power == 0) {
        return 1;
    }
        return numberal * calculate(numberal, power - 1);

}

    public static void main(String[] args) {
        int number1, number2;
        Scanner giris = new Scanner(System.in);

        System.out.print("Insert a number: ");
        number1 = giris.nextInt();
        System.out.print("Insert a power: ");
        number2 = giris.nextInt();
        System.out.println("Result : " + calculate(number1, number2));
    }
}
