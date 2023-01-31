class test {
    static {
        System.out.println("eeee");
    }
    static {
        System.out.println("aaaa");
    }

    // is class test is not loaded, these blocks will not execute
}

public class staticBlock {
    static {
        System.out.println("block 1a");
    }

    public static void main(String[] args) {
        System.out.println("main");
        // main is executed after executing all static blocks

        test t = new test();
        // if you don't write this, the class will not get loaded
        // and the static blocks will not get printed
    }

    static {
        System.out.println("block 2a");
    }
}
