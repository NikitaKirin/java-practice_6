package nikitakirin.equation;

public record QuadraticEquation(double a, double b, double c) {

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (a != 0) {
            sb.append(a).append("x^2");
        }
        if (b != 0) {
            if (a != 0 && b > 0) {
                sb.append("+");
            }
            sb.append(b).append("x");
        }
        if (c != 0) {
            if ((a != 0 || b != 0) && c >= 0) {
                sb.append("+");
            }
            sb.append(c);
        }
        sb.append(" = 0");
        return sb.toString();
    }

    public boolean isQuadraticEquation() {
        return a != 0;
    }
}
