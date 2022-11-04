import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;

public class CalendarWorker {

    public void getDayOfWeek(String date) throws DateTimeParseException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, dtf);
        DayOfWeek dow = localDate.getDayOfWeek();
        System.out.println(dow);
    }

    public static void getNexTuesday() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        final int tuesday = 3;

        Calendar calendar = Calendar.getInstance();
        int dif = tuesday - calendar.get(Calendar.DAY_OF_WEEK);
        if (dif <= 0) {
            dif += 7;
        }
        calendar.add(Calendar.DAY_OF_WEEK, dif);
        System.out.println("Следующий вторник: " + sdf.format(calendar.getTime()));
    }

}
