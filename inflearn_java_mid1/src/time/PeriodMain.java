package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate currentDate = LocalDate.of(2030,1,1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("plusDate = " + plusDate);
        System.out.println("currentDate = " + currentDate);

        LocalDate startDate = LocalDate.of(2024, 7, 15);
        LocalDate endDate = LocalDate.of(2024, 12, 25);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 = " + between.getMonths() + "개월 " + between.getDays()+"일");
    }
}
