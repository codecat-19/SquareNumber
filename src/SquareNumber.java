import java.util.Scanner;

public class SquareNumber {

    public static void main(String[] args) {
    Double num;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a #");
    num = scan.nextDouble();

    Double square = Math.pow(num, 2);
    System.out.println("Square of " + num + " is " + square);
    }
}
