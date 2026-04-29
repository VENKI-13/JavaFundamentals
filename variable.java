class variable{
    public static void main(String[] args) {
        parama g = new parama();
        System.out.println(parama.x);
        g.padi();
        System.out.println(g.str);
    }
}
class parama{
    String str = "QWERTYUIOPASDFGHJKLZXCVBNM";
    static int x = 10;
    void padi(){
        final int z = 10;
        int w = 10,q = 20;
        System.out.println(w+q);
        System.out.println(z);
    }
}