import java.util.*;

public class JavaBasicPrograms {
    public static void main(String[] args) throws Exception {
        System.out.println("To check string equal or not: ");

            // To Check Two String Equal Or Not
            Scanner a = new Scanner(System.in);
            System.out.println("Enter the First String: ");
            String s1 = a.nextLine();
            System.out.println("Enter the First String: ");
            String s2 = a.nextLine();
            if (s1.compareTo(s2) == 0) {
                System.out.println("Given String Are Equal");
            } else {
                System.err.println("Given String Are Not Equal");
            }
    }
}
