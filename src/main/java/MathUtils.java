public class MathUtils {
    public static int additionner(int a, int b) {
        return a + b;
    }

    public static int soustraire(int a, int b) {
        return a - b;
    }

    public static int multiplier(int a, int b) {
        return a * b;
    }

    public static int additionnertable(int[] table) {

        int sum = 0;
        for (int i = 0; i < table.length; i++) {

            sum = sum + table[i];
        }
            return sum;

        }
    }

