import java.util.*;

public class conditionalstatement {
    public static void main(String args[]) {
        // find radix of a given number in a string
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        String num;
        num = scan.nextLine();

        if (num.matches("[01]+")) {
            System.out.println("Binary Radix = 2");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal Radix = 8");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimmal Radix = 10");
        } else if (num.matches("[0-9A-F]+")) {
            System.out.println("Hexa Radix = 16");
        } else {
            System.out.println("Not a number");
        }

        // find a given year is leap year

        int n = 3;
        switch (n) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("invalid");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Domain name");
        String domain = scanner.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".") + 1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;

            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
        }
    }

}
