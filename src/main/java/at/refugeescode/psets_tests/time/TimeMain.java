package main.time;

import main.time.stock.StockApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;

public class TimeMain {

    public static void main(String[] args) {
        // WHEN?
        // LocalDateTime, LocalDate, LocalTime (time zone is not required)
        // if the Hackathon was on the 3rd of February, which day of the week was it?
        // and which day of the week will it be next year?

        LocalDate localDateNow = LocalDate.now();
        System.out.println("LocalDate now: " + localDateNow);
        LocalDate lastDayOfThisYear = LocalDate.of(2018, 12, 31);
        System.out.println("LocalDate of last day of this year: " + lastDayOfThisYear);

        LocalDate hackathonThisYear = LocalDate.parse("2018-02-03");
        System.out.println("LocalDate of Hackathon this year: " + hackathonThisYear);
        DayOfWeek dayOfWeekThisYear = hackathonThisYear.getDayOfWeek();
        System.out.println("Hackathon this year happened on a " + dayOfWeekThisYear);
        LocalDate hackathonNextYear = hackathonThisYear.plusYears(1);
        DayOfWeek dayOfWeekNextYear = hackathonNextYear.getDayOfWeek();
        System.out.println("Hackathon next year will happen on a " + dayOfWeekNextYear);
        LocalDate hackathonLastYear = hackathonThisYear.minusYears(1);
        DayOfWeek dayOfWeekLastYear = hackathonLastYear.getDayOfWeek();
        System.out.println("Hackathon last year happened on a " + dayOfWeekLastYear);

        LocalDate birthday = LocalDate.parse("1988-07-04");
        System.out.println("Birthdate day: " + birthday.getDayOfWeek());

        System.out.println("LocalTime now: " + LocalTime.now());
        LocalTime lecturesBegin = LocalTime.of(10, 00);
        System.out.println("LocalTime of when lectures begin: " + lecturesBegin);
        LocalTime lectureBreak = lecturesBegin.plusHours(3);
        System.out.println("LocalTime of the lecture break: " + lectureBreak);

        LocalDateTime puzzleDay = LocalDate.now().minusDays(3).atTime(18, 00);
        System.out.println("Puzzle Day happened on a " + puzzleDay.getDayOfWeek());


        // HOW DO I DISPLAY IT?
        // DateTimeFormatter
        // ISO format yyyy-MM-dd HH:mm:ss default way
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String text = formatter.format(LocalDate.of(2018, 06, 01));
        System.out.println(text);
        TemporalAccessor temporal = formatter.parse("17 03 2018");
        LocalDate thisParticularDate = LocalDate.from(temporal);
        System.out.println("This particular date is: " + thisParticularDate);


        // HOW MUCH TIME?
        // Duration, Period
        // how much time does it take to ask for several stock prices?
        System.out.println("Let's look up for Stocks");
        StockApi stockApi = new StockApi();
        LocalTime before = LocalTime.now();
        Arrays.asList("GOOG", "APPL", "NFLX")
                .parallelStream() // careful with this
                .map(symbol -> stockApi.lookup(symbol))
                .forEach(stock -> System.out.println(stock));

        LocalTime after = LocalTime.now();
        Duration duration = Duration.between(before, after);
        System.out.println("It took me " + duration.getSeconds() + " seconds to lookup all of them");

        // how about asking in parallel? (parallel streams)
        // how many days did the OOP month actually last?
        LocalDate startOfOOP = LocalDate.parse("2018-02-12");
        LocalDate endOfOOP = LocalDate.of(2018, 03, 18);
        Period oopPeriod = Period.between(startOfOOP, endOfOOP);
        System.out.println("The OOP month lasted this much: " + oopPeriod.getMonths() + " months and " + oopPeriod.getDays() + " days");
        long numberOfDaysInOOP = ChronoUnit.DAYS.between(startOfOOP, endOfOOP);
        System.out.println("The OOP month lasted this number of days: " + numberOfDaysInOOP);


        // WHEN IS IT EXACTLY WHERE?
        // ZonedDate, ZonedTime (time zone is required) ZoneId
        // which time is right now in Japan?

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalDateTime now = LocalDateTime.now();

        ZoneId vienna = ZoneId.of("Europe/Vienna");
        ZoneId japan = ZoneId.of("Japan");

        ZonedDateTime viennaTime = now.atZone(vienna);
        ZonedDateTime japanTime = viennaTime.withZoneSameInstant(japan);

        System.out.println("Now in Vienna: " + timeFormatter.format(viennaTime));
        System.out.println("Now in Japan: " + timeFormatter.format(japanTime));
    }

}
