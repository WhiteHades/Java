class Super {
    public void meth1() {
        System.out.println("Super meth1");
    }

    public void meth2() {
        System.out.println("Super meth2");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub meth2");
    }

    public void meth3() {
        System.out.println("Sub meth3");
    }
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        // Super sup = new Super();
        // sup.meth1();
        // sup.meth2();

        // Sub s = new Sub();
        // s.meth1();
        // s.meth2();
        // s.meth3();

        // Dynamic Memory Dispatch
        // Sub s = new Super(); not allowed
        Super sup = new Sub();
        sup.meth1();
        sup.meth2(); // this, i.e., the overriding, will be called based
        // on the object, not the reference
        // sup.meth3(); not allowed
    }
}
