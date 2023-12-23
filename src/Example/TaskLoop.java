package Example;

/**
 * Написать программу высчитывающую факториал введенного числа.
 *
 */
public class TaskLoop {
    public static void main(String[] args) {

//        1 * 2 * 3 * 4 * 5 = 5!
        int v = 5;
        int result = factorial(v);
        System.out.println(result);

    }
    public static int factorial(int v) {
        int result = 1;
        for (int i = 1; i <= v; i++) {
            result *= i; // result = result * i;
            
        }
        return result;
    }
}