
import java.util.Scanner; 
class scn{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = s.nextLine();
        System.out.print("Your mobile no: ");
        long no = s.nextLong();
        System.out.print("Your mail: ");
        String mail = s.next();
        System.out.println("Name: "+name);
        System.out.println("No: "+no);
        System.out.println("Mail "+mail);
    }
}