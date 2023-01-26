package vorlesung2;
import java.util.Scanner;

class Squared {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Squared(math): " + Math.pow(scanner.nextInt(), 2));

        scanner.close();
    }
}
