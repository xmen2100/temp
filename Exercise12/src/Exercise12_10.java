import java.util.ArrayList;

public class Exercise12_10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            while (true) {
                int i = (int)(Math.random() * 101);
                arrayList.add(i);
            }
        }
        catch (OutOfMemoryError ex) {
            System.out.println("Ran out of memory");
        }
    }

}
