package nikitakirin.generator;

public class SerialIntGenerator implements IntGenerator {

    static int counter = 0;

    public int nextPositive() {
        counter++;
        return counter;
    }

    public int nextNegative() {
        counter++;
        return -counter;
    }

    public String getName() {
        return "Генератор целых чисел на основе последовательности.";
    }
}
