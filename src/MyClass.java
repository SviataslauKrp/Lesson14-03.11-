public class MyClass {

    public void oneMethod(String lineToReverse) {
        Reversable revers = line -> new StringBuilder(line).reverse().toString();
        System.out.println(revers.reverse(lineToReverse));
    }
}
