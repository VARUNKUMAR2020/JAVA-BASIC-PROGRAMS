public class JavaBasicPrograms {
    // a static variable
    static int a = 10;

    // a static method
    static void method() {
        System.out.println("From static method");
    }

    // a static block
    static {
        System.out.println("From static block");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // calling a static method
        // without creating an object
        method();

        // accessing a static variable
        // without creating an object
        System.out.println(a);
    }
}
