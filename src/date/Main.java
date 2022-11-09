package date;
/**
 * day = [ 1, 31]
 * month = [1, 12]
 * year = [1900, 9999
 */
/**
 * Date деген класс тузунуз аныны поляларын
 * конструктор жардамында
 * сеттер жардамында
 * setDate() деген метод  жардамында толтуруп аларды томондогудой консолго чыгарыныз
 * The expected output is:
 * 01/02/2014
 * 09/12/2099
 * Month: 12
 * Day: 9
 * Year: 2099
 * 07/11/2022
 *
 *
 * dd/mm/yyyy
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date(
                1,
                8,
                2014
        );
        System.out.println(date);

        date.setDay(9);
        date.setMonth(12);
        date.setYear(2099);
        System.out.println(date);


        System.out.println("Month: "+date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: "+ date.getYear());

        date.setDate(7, 11, 2022);

        System.out.println(date);
    }
}
