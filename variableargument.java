public class variableargument {

    static void show(int... x) {
        for (int a : x) {
            System.out.println(a);
        }
    }

    public static void main(String args[]) {
        show();
        show(10, 20, 30);
        show(new int[] { 3, 5, 7 });// anonymous array
    }
}