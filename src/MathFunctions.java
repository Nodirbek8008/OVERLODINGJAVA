public class MathFunctions {

    // Ikkita sonni yig'indisini qaytaradi
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Ikkita sonni ayirmasini qaytaradi
    public static <T extends Number> double sub(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    // Ikkita sonni ko'paytmasini qaytaradi
    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    // Ikkita sonni bo'linmasini qaytaradi
    public static <T extends Number> double div(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Bo'linish nolga bo'linmaydi");
        }
        return a.doubleValue() / b.doubleValue();
    }

    // Sonning absolyut qiymatini qaytaradi
    public static <T extends Number> double abs(T a) {
        return Math.abs(a.doubleValue());
    }

    // Sonning kvadrat qiymatini qaytaradi
    public static <T extends Number> double pow(T a) {
        return Math.pow(a.doubleValue(), 2);
    }
}


