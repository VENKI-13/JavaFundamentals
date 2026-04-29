class control{
    public static void main(String[] args){
        int m = 2016;
        if(m%400==0 || m%4==0 && m%100==0)
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }
}