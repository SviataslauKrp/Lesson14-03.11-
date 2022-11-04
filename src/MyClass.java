import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {

    public void oneMethod() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                System.out.println("Введите 1 для выполнения функции реверса. Введите 0 для выхода");
                String str = bufferedReader.readLine();
                if (str.equals("0")) break;

                if (str.equals("1")) {
                    System.out.println("Введите строку, которую хотите реверсировать");
                    String lineToReverse = bufferedReader.readLine();
                    Reversable revers = line -> new StringBuilder(line).reverse().toString();
                    System.out.println(revers.reverse(lineToReverse));
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
