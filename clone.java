import java.util.Arrays;

class clone{
    public static void main(String[] args) {
        int a[]  = {1,2,3,4,5};
        int b[] = new int[a.length];
        int c[] = new int[a.length];
        int d[] = new int[a.length];
        int e[] = new int[a.length];
        b=a.clone();
        System.arraycopy(a,0,c,0,5);
        d = Arrays.copyOf(a,2);
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"a: "+a[i]);
            System.out.println((i+1)+"b: "+b[i]);
            System.out.println((i+1)+"c: "+c[i]);
            System.out.println((i+1)+"d: "+d[i]);
        }
    }
}