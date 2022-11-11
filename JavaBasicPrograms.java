public class JavaBasicPrograms {
    // Primitive Data Types
    boolean b;
    char c;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;

    public static void main(String[] args) throws Exception {
        System.out.println("Default values of Primitive DataTypes: ");

        // Creating A Object Of The Class
        JavaBasicPrograms demo = new JavaBasicPrograms();

        // Displaying All Primitive Data Types
        System.out.println("Default value of Boolean  : " + demo.b);
        System.out.println("Default value of Character: " + demo.c);
        System.out.println("Default value of Byte     : " + demo.by);
        System.out.println("Default value of Short    : " + demo.s);
        System.out.println("Default value of Int      : " + demo.i);
        System.out.println("Default value of Long     : " + demo.l);
        System.out.println("Default value of Float    : " + demo.f);
        System.out.println("Default value of Double   : " + demo.d);
    }
}
