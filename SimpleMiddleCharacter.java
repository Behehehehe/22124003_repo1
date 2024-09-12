import java.util.Scanner;

public class SimpleMiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int middle = input.length() / 2;

        if (input.length() % 2 == 0) {
            System.out.println("Middle characters: " + input.charAt(middle - 1) + input.charAt(middle));
        } else {
            System.out.println("Middle character: " + input.charAt(middle));
        }

        scanner.close();
    }
}
