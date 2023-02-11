public class exceptionHandlingsecond {
    public static void main(String[] args) {

        try {
            int a[] = { 10, 0, 2, 3, 5 };
            int r;

            r = a[0] / a[1];

            System.out.println(r);
            System.out.println(a[0]);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
