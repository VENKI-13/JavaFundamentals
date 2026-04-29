import java.util.Scanner;
class control{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Year: ");
        int m = s.nextInt(); 
        if(m%400==0 || m%4==0 && m%100!=0)
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }
}