public class literals {
    public static void main(String asrg[]) {
        byte b = 15;
        short s = 15;
        int i = 15;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println("\n");

        // Integer literals can be written in decimal, binary, octal or hexadecimal
        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0xA;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("\n");

        long l = 999_999_999L;
        // int i2 = 125L; // will not work because long is bigger than int
        System.out.println(l);

        float f = 123_456.56f;
        double d = 12.56d;
        System.out.println(f);
        System.out.println(d);

        int x = -5;
        System.out.println(Integer.toBinaryString(x));

        char unicode = 0x0370;
        System.out.println(unicode);
    }
}
