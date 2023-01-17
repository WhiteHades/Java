public class regularexpression {
    public static void main(String args[]) {
        // find if the email id is on gmail
        // find username and domain name
        // assume it is gmail and/or email

        String str = "programmer@gmail.com";

        System.out.println(str.matches(".*gmail.*"));

        int ind = str.indexOf("@");

        // username
        System.out.println(str.substring(0, ind));

        // domain name
        System.out.println(str.substring(ind + 1, str.length()));

        // alternative way
        // String domain = str.substring(i+1, str.length());
        // System.out.println(domain.startsWith("gmail"));

        //////////////////////////////////////////////

        // find if a number is binary or not
        int b = 100110;
        String str1 = String.valueOf(b);
        System.out.println(str1.matches("[01]+"));

        // find if a number is hexa-decimal or not
        String str2 = "234AB";
        System.out.println(str2.matches("[0-9A-F]+"));

        // find if the data is in date format
        String date = "13/12/1111";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        /////////////////////////////////////////////////

        // remove special characters from string
        String str3 = "a!B@c#$2%3";
        System.out.println(str3.replaceAll("[^a-zA-Z0-9]", ""));

        // remove "extra" spaces from string
        String str4 = "   a!     B@c#        $2    %3             ";
        System.out.println(str4.replaceAll("\\s+", " ").trim());

        // find number of words in string
        String str5 = "hello this is a test";
        String str6 = str5.replaceAll("\\s+", " ").trim();
        String words[] = str6.split("\\s");
        System.out.println(words.length);

    }
}
