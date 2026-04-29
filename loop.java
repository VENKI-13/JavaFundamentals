import java.util.Scanner;
class loop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int n = s.nextInt();
        System.out.println("Output: "+n);
        while(n!=0){
            System.out.print("Input: ");
            n = s.nextInt();
            System.out.println("Output: "+n);
        }
    }
}
