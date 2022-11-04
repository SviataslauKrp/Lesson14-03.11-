import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {

    public void oneMethod() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String str = bufferedReader.readLine();
            String lineToReverse = bufferedReader.readLine();

            if (str.equals("1")) {
                Reversable<String> revers = line -> new StringBuilder(lineToReverse);
                System.out.println(revers);
            } else {
                oneMethod();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
