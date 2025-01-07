public class str {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";

        if (s1.equals(s2)) {
            System.out.println("s1 equal to s2");
        } else {
            System.out.println("s1 not equal to s2");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 equal to s2");
        } else {
            System.out.println("s1 not equal to s2");
        }


        if (s1.compareTo(s2) > 0) {
            System.out.println(" s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println(" s1 < s2");
        } else {
            System.out.println(" s1 = s2");
        }


        if (s1 == s2) {
            System.out.println(" s1 == s2");
        } else {
            System.out.println(" s1 != s2");
        }
    }
}
