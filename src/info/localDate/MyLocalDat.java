package info.localDate;

import java.time.LocalDate;

public class MyLocalDat {
    /**
     * Java LocalDate классы -
     * yyyy-mm-gg  форматы менен Датаны билдирген өзгөрүлгүс класс.
     * Ал Object классын мурастап, ChronoLocalDate интерфейсин ишке ашырат
     *
     * ссылка: https://www.javatpoint.com/java-localdate
     */

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
    }

}
