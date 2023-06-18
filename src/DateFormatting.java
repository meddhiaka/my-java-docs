import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("MM*yyyy*dd");
        String date = currentDate.format(Formatter);
        System.out.println(date);
    }
}