// WAP to calculate and display the percentage of uppercase letters, lowercase letters, digits, and special characters in a given string.

package JavaProgramming;

public class P80_StringPercentage {

    public static void main(String[] args) {
        String str = "Aa1@";
        float upper = 0.0f, lower = 0.0f, digit = 0.0f, special = 0.0f;
        float totalLength = str.length(); // Total length of the string

        // Iterate over each character in the string
        for (int i = 0; i < totalLength; i++) {
            char ch = str.charAt(i); // Get character at index i
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                special++;
            }
        }

        // Calculate percentages
        System.out.printf("Uppercase Letters: %.2f%%\n", (upper / totalLength) * 100);
        System.out.printf("Lowercase Letters: %.2f%%\n", (lower / totalLength) * 100);
        System.out.printf("Digits: %.2f%%\n", (digit / totalLength) * 100);
        System.out.printf("Special Characters: %.2f%%\n", (special / totalLength) * 100);
    }
}
