public class ThrowAndThrows {
    static int meth1() {
        return 10 / 0;// unchecked exception
    }

    static int meth2() {
        return meth1();
    }

    static int meth3() {
        return meth2();
    }

    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception();
        }
        return l * b;
    }

    static void meth4() throws Exception {
        System.out.println("Area is " + area(-10, 5));
    }

    public static void main(String[] args) throws Exception {
        // meth3();

        // you could use this try catch in meth2 and meth1 as well
        try {
            meth3();
        } catch (Exception e) {
            System.out.println(e);
        }

        meth4();

    }
}
