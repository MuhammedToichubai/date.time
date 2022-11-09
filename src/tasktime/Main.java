package tasktime;

/**
 * The expected output is:
 * "hh:mm:ss" with leading zero
 * 01:02:03
 * 04:05:06
 * Hour: 4
 * Minute: 5
 * Second: 6
 * 23:59:58
 * 23:59:59
 * 00:00:01
 * 00:00:00
 * 23:59:58
 */
public class Main {
    public static void main(String[] args) {

        Time time = new Time(1,2, 3);

        System.out.println(time);

        for (int i = 0; i < 10983; i++) {
            time.nextSecond();
        }
        System.out.println(time);

        time.setHour(4);
        time.setMinute(5);
        time.setSecond(6);
//
        System.out.println("Hour: "+time.getHour());
        System.out.println("Minute: "+time.getMinute());
        System.out.println("Second: "+time.getSecond());

        Time time1 = new Time(23,59, 58);
        System.out.println(time1);
//
        time1.nextSecond();
        System.out.println(time1);
//
        time1.nextSecond();
        time1.nextSecond();
        System.out.println(time1);
//
        time1.previousSecond();
        System.out.println(time1);
//
        time1.previousSecond();
        time1.previousSecond();
        System.out.println(time1);


    }
}
