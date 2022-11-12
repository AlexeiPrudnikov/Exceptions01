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

    //    Задание № 4
    //    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
    //    возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    //    Если длины массивов не равны, необходимо как-то оповестить пользователя.
    //    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static Double[] calculateDiv(Integer[] dividend, Integer[] divisor) {
        // Т.к. по условию исключение должно возникать только при несоответствии длин массивов
        // При передаче в метод значения null, исключения не возникнет
        if (dividend == null || divisor == null) {
            return null;
        }
        if (dividend.length != divisor.length) {
            throw new RuntimeException("Размеры вычитаемых массивов не равны");
        }
        Double[] result = new Double[dividend.length];
        for (int i = 0; i < result.length; i++) {
            // Если элемент невозможно вычислить - заполняем значением null
            // По условию задачи исключение не выбрасываем
            if (dividend[i] == null || divisor[i] == null || divisor[i] == 0) {
                result[i] = null;
            } else {
                result[i] = Double.valueOf(dividend[i]) / Double.valueOf(divisor[i]);
            }
        }
        return result;
    }
}
