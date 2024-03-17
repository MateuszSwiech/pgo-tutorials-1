import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Exercise1();


    }

    public static void Exercise1() {
        System.out.println("Provide an integer:");
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();

        if (integer > 0) {
            System.out.println("The number is positive");
        } else if (integer < 0) {
            System.out.println("The number is negative");
        } else if (integer == 0) {
            System.out.println("The value equals 0");


        }
    }
}