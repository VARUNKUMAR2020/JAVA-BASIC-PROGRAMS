import java.util.Scanner;

public class JavaBasicPrograms {
    public static void main(String[] args) throws Exception {
        System.out.println("To check Leap Year Or Not!!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year to check: ");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 00 || year % 400 == 0) {
            System.out.println(year + " is a leap year!!");
        } else {
            System.out.println(year + " is not a leap year!!");
        }
    }
}
