import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        Date date = new Date();

        date.setTime(10000L);
        System.out.println(date);

        date.setTime(100000L);
        System.out.println(date);

        date.setTime(1000000L);
        System.out.println(date);

        date.setTime(10000000L);
        System.out.println(date);

        date.setTime(100000000L);
        System.out.println(date);

        date.setTime(1000000000L);
        System.out.println(date);

        date.setTime(10000000000L);
        System.out.println(date);

        date.setTime(100000000000L);
        System.out.println(date);
    }
}

