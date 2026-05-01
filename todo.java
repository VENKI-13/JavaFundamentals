import java.util.Scanner;
class todo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the task: ");
        String m = s.nextLine();
        list l = new list();
        l.task(m);
    }
}
class list{
    void task(String m){
        if(m.isBlank()){
            System.out.println("Kindly enter your task");
        }
        System.out.println("To-Do: "+m);
    }
}