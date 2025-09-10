import java.util.Scanner;

public class Ques6 {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

       
        handleException(text);
    }
}
