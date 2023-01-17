public class creatingstringobjects {
    public static void main(String args[]) {

        String str1 = "java program";
        String str2 = new String("java");
        char c[] = { 'h', 'e', 'l', 'l', 'o' };
        byte b[] = { 65, 66, 67, 68 };
        String str4 = new String(b, 1, 3);

        System.out.println(str4);
    }

}
