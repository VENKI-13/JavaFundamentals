//Check String Starts With Java 
import java.util.Scanner;
class checkstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.startsWith("Java"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
