import java.util.Scanner;

public class Dance {

    public static void main(String[] args) {
        dance();
    }

    public static void dance() {
        while (true) {
            siphon();
            System.out.println(" 0/");
            System.out.println("/| ");
            System.out.println(" ||");
            sleep(500);
            siphon();
            System.out.println("\\0 ");
            System.out.println(" |\\");
            System.out.println("|| ");
            sleep(500);
        }
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void siphon() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
