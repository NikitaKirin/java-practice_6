import nikitakirin.equation.QuadraticEquation;
import nikitakirin.generator.IntGenerator;
import nikitakirin.generator.RandomIntGenerator;
import nikitakirin.generator.SerialIntGenerator;
import nikitakirin.generator.TimeDependetIntGenerator;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        demoQuadraticEquation();
        demoIntGenerator();
    }

    public static void demoQuadraticEquation() {
        QuadraticEquation[] quadraticEquations = {
                new QuadraticEquation(3, -2, 1),
                new QuadraticEquation(0, 2, 3),
                new QuadraticEquation(1, 0, 5),
                new QuadraticEquation(1, 2, 0),
                new QuadraticEquation(0, 0, 20),
                new QuadraticEquation(1, 0, 0),
                new QuadraticEquation(0, -4, 0),
        };

        for (QuadraticEquation equation : quadraticEquations) {
            out.printf("Is equation '%s' quadratic? – %s\n", equation, equation.isQuadraticEquation());
        }
    }

    public static void demoIntGenerator() {
        IntGenerator[] intGenerators = {
                new RandomIntGenerator(),
                new TimeDependetIntGenerator((int) 1e5, 1000),
                new SerialIntGenerator(),
        };
        for (IntGenerator intGenerator : intGenerators) {
            out.println(intGenerator.getName());
            for (int i = 0; i < 8; i++) {
                // увеличиваем интервал между значениями временной метки
                if (intGenerator instanceof TimeDependetIntGenerator) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                out.println(intGenerator.nextPositive());
                out.println(intGenerator.nextNegative());
            }
        }
    }
}