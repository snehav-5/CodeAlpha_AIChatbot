
import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       AI CHATBOT");
        System.out.println("================================");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye") || input.equals("exit")) {
                System.out.println("Bot: Goodbye! Have a great day!");
                break;
            }

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am a Java-based AI Chatbot.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great! Thanks for asking.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a popular object-oriented programming language.");
            }
            else if (input.contains("help")) {
                System.out.println("Bot: You can ask me about Java, programming, or general questions.");
            }
            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that yet.");
            }
        }

        sc.close();
    }
}
