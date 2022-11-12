import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] minuend = {1, 2, 3, 1};
        int[] subtrahend = {1, 1, 1};
        int[] result = calculateSub(minuend, subtrahend);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

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

    //    Задание № 3
    //    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
    //    возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    //    Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] calculateSub(int[] minuend, int[] subtrahend) {
        if (minuend.length != subtrahend.length) {
            throw new RuntimeException("Размеры вычитаемых массивов не равны");
        }
        int[] result = new int[minuend.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = minuend[i] - subtrahend[i];
        }
        return result;
    }
}
