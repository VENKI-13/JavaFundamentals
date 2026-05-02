// Expense Tracker 
import java.util.Scanner;
public class expensetracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of expenses: ");
        n = sc.nextInt();
        sc.nextLine();
        double[] amount = new double[n];
        String[] category = new String[n];
        double total = 0;
        double foodTotal = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Enter amount: ");
            amount[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter category: ");
            category[i] = sc.nextLine();
            total += amount[i];
            if(category[i].equalsIgnoreCase("Food"))
                foodTotal += amount[i];
        }
        System.out.println("\n--- Expense Details ---");
        for(int i = 0; i < n; i++) {
            System.out.println(category[i] + " : " + amount[i]);
        }
        System.out.println("\nTotal Expense: " + total);
        System.out.println("Total Food Expense: " + foodTotal);
    }
}