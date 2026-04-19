public class Main {
    public static void main(String[] args) {

        int count = 0;
        String str = "Symbiosis Institute of tech";

        System.out.println(str);

        int len = str.length();
        System.out.println(len);

        String s1 = str.toUpperCase();
        System.out.println(s1);

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch == 'S') {
                count++;
            }
            // System.out.println(ch);
        }

        System.out.println("Count of S is : " + count);
    }
}
