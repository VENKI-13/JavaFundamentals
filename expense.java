import java.util.Scanner;
public class expense {
    public static void main(String[] args) {
        int sum = 0,n;
        System.out.println("Welcome to Sunday Samayal");
        System.out.println("\t1.Dosa\t-15\t-\t1pc\n\t2.Poori\t-20\t-\t1set\n\t3.Idli\t-10\t-\t1set");
        Scanner s = new Scanner(System.in);
        System.out.println("Press 0 to know the total price");
        do{
        System.out.print("Enter the serial no of the food to add into cart : ");
        n = s.nextInt();
        switch(n) {
            case 1:
                sum += 15;
                break;
            case 2:
                sum+=20;
                break;
            case 3:
                sum+=10;
                break;
            default:
                System.out.println("Kindly select from the menu list");
            }
        }while(n!=0);
        System.out.println("Total: "+sum);
    }
}
