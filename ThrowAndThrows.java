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

    public static void main(String[] args) {
        meth3();
    }
}
