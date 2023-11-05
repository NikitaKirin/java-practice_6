package nikitakirin.generator;

import java.util.Random;

public final class RandomIntGenerator implements IntGenerator {

    public int nextPositive() {
        Random random = new Random();
        return random.nextInt(0, Integer.MAX_VALUE);
    }

    public int nextNegative() {
        Random random = new Random();
        return random.nextInt(-Integer.MAX_VALUE, 0);
    }

    public String getName() {
        return "Генератор рандомных целых чисел.";
    }
}
