import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;

public class CalendarWorker {

    public void getDayOfeWeek() {
        System.out.println("Введите дату в формате dd-MM-yyyy");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String strDate = bufferedReader.readLine();
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(strDate);
            System.out.println(new SimpleDateFormat("EEEE").format(date));

        } catch (IOException | ParseException e) {
            getDayOfeWeek();
        }
    }

    public static void getNexTuesday() {
        Date currentDate = new Date();

    }

}
