package Test_26_06_2025;

public class Coding_Challenge_2 {
    public static void main(String[] args) {
        // Input Strings
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // == operator (reference comparison)
        boolean isEqualReference = (string1 == string2); // false
        boolean isEqualReference2 = (string1 == string3); // true (both literals)

        // equals() - content comparison (case-sensitive)
        boolean isEqualContent = string1.equals(string2); // false

        // equalsIgnoreCase() - content comparison (case-insensitive)
        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2); // true

        // compareTo() - lexicographic comparison (case-sensitive)
        int compareResult = string1.compareTo(string2); // -32

        // Output
        System.out.println("== (string1 == string2): " + isEqualReference);
        System.out.println("== (string1 == string3): " + isEqualReference2);
        System.out.println("equals(): " + isEqualContent);
        System.out.println("equalsIgnoreCase(): " + isEqualIgnoreCase);
        System.out.println("compareTo(): " + compareResult);
    }
}


