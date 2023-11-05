package nikitakirin.generator;

public final class TimeDependetIntGenerator implements IntGenerator {

    private int prime;

    private int max;

    public TimeDependetIntGenerator(int prime, int max) {
        this.prime = prime;
        this.max = max;
    }

    public int nextPositive() {
        long currentTimestamp = System.currentTimeMillis();
        return (int) (((double) currentTimestamp % prime / prime) * max);
    }

    public int nextNegative() {
        long currentTimestamp = System.currentTimeMillis();
        return -(int) (((double) currentTimestamp % prime / prime) * max);
    }

    public String getName() {
        return "Генератор целых чисел на основе текущей временной метки.";
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
