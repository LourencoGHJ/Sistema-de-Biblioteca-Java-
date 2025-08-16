package app;
import java.util.Scanner;

public class Util {
    private static final Scanner input = new Scanner(System.in);

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return input.nextLine();
    }

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(input.nextLine());
    }
}
