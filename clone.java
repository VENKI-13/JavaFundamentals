import java.util.Arrays;

class clone{
    public static void main(String[] args) {
        int a[]  = {1,2,3,4,5};
        int b[] = new int[5];
        int c[] = new int[5];
        int d[] = new int[5];
        int e[] = new int[5];
        b=a.clone();
        System.arraycopy(a,0,c,0,5);
        d = Arrays.copyOf(a,2);
        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+"a: "+a[i]);
            System.out.println((i+1)+"b: "+b[i]);
            System.out.println((i+1)+"c: "+c[i]);
            System.out.println((i+1)+"d: "+d[i]);
        }
    }
}