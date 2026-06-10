import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot Started!");
        System.out.println("Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            } else if (input.contains("hello")) {
                System.out.println("Bot: Hello! How can I help you?");
            } else if (input.contains("name")) {
                System.out.println("Bot: I am CodeAlpha Chatbot.");
            } else if (input.contains("java")) {
                System.out.println("Bot: Java is a popular programming language.");
            } else {
                System.out.println("Bot: Sorry, I didn't understand that.");
            }
        }
        sc.close();
    }
}
