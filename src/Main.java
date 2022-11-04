import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeParseException;

public class Main {
    private static final BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        CalendarWorker cw = new CalendarWorker();
        MyClass mc = new MyClass();
        try (bufReader) {
            while (true) {
                System.out.println("Введите номер задания или 0 для выхода");
                try {
                    int n = Integer.parseInt(bufReader.readLine());
                    switch (n) {
                        case 1:
                            System.out.println("Введите дату в формате dd-MM-yyyy");
                            while (true) {
                                String date = bufReader.readLine();
                                try {
                                    cw.getDayOfWeek(date);
                                    break;
                                } catch (DateTimeParseException e) {
                                    System.out.println("Введена некорректная дата");
                                }
                            }
                            break;
                        case 2:
                            CalendarWorker.getNexTuesday();
                            break;
                        case 3:
                            while (true) {
                                System.out.println("Введите 1 для выполнения функции реверса. Введите 0 для выхода");

                                String str = bufReader.readLine();
                                if (str.equals("0")) {
                                    System.out.println("Фхуф, отработали");
                                    break;
                                } else if (str.equals("1")) {
                                    System.out.println("Введите строку, которую хотите реверсировать");
                                    mc.oneMethod(bufReader.readLine());
                                    break;
                                }
                            }
                            break;
                    }
                    if (n == 0) {
                        System.out.println("Фхуф, отработали");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введите номер задания корректно");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}