import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String foramttedString = today.format(formatter);
        System.out.println(isDateOdd(foramttedString));
    }

    public static boolean isDateOdd(String foramttedString) {

        boolean eventDay = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(foramttedString, formatter);
        if (dateTime.getDayOfYear() % 2 == 0) {
            eventDay = false;
        }

        return eventDay;
    }
}