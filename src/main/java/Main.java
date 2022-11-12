import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    //    Задание № 1
    //    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    //    При вызове divInt(12, 0) получаем:
    //    java.lang.ArithmeticException: / by zero
    public static int divInt(int a, int b) {
        return a / b;
    }

    //   При вызове метода calculateSum получаем:
    //   java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //   При вызове метода getCountNegativeElements(null) получаем:
    //   java.lang.NullPointerException: Cannot read the array length because "numbers" is null
    public static int getCountNegativeElements(Integer[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
