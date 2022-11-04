import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;

public class CalendarWorker {

    public void getDayOfWeek() {
        System.out.println("Введите дату в формате dd-MM-yyyy");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String strDate = bufferedReader.readLine();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                try {
                    LocalDate localDate = LocalDate.parse(strDate, dtf);
                    DayOfWeek dow = localDate.getDayOfWeek();
                    System.out.println(dow);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Введена некоррекная дата: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
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
