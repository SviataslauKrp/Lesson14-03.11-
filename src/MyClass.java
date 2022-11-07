public class MyClass {

    public void oneMethod(String lineToReverse) {
        Reversable wordToRevers = line -> new StringBuilder(line).reverse().toString();
        System.out.println(wordToRevers.reverse(lineToReverse));
    }
}
