public class MiddleCharacter {
    public static void main(String[] args) {
        String inputString = "Hello, world!"; // Replace this with your desired string

        int length = inputString.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            // Even length: Display the two middle characters
            System.out.println("Middle characters: " + inputString.charAt(middleIndex - 1) + inputString.charAt(middleIndex));
        } else {
            // Odd length: Display the single middle character
            System.out.println("Middle character: " + inputString.charAt(middleIndex));
        }
    }
}
