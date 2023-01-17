public class arrays {
    public static void main(String args[]) {
        // finding sum of all elements
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }

        // finding second largest element
        int max1 = A[0];
        int max2 = A[1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            }
        }
        System.out.println("Second largest is " + max2);

        // rotating an array left
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println("");

        // reverse copying an array
        int B[] = new int[10];
        int count = 0;

        for (int i = A.length - 1; i >= 0; i--) {

            B[count] = A[i];
            count++;
        }
        for (int x : B) {
            System.out.print(x + " ");
        }
        System.out.println("");

        // jagged arrays

        int a[][];
        a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];

        for (int x[] : a) {
            for (int y : x) {
                System.out.print(y + "");
            }
            System.out.println("");
        }
    }
}
