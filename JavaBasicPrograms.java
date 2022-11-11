public class JavaBasicPrograms {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                count++;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Number of invalid integers = " + count);
    }
}
