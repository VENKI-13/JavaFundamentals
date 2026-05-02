import java.util.ArrayList;
import java.util.Arrays;
class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(arr);
        arr.remove(9);
        arr.set(8,13);
        System.out.println(arr);
    }
}
