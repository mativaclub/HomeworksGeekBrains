public class Main {
    public static void main(String[] args) {

        System.out.println("Вывести все натуральные числа в промежутке от M до N");
        printNaturalNumbersInRange(5, 10);
        System.out.println();

        System.out.println("Напишите программу вычисления функции Аккермана с помощью рекурсии");
        System.out.println(ackermann(2, 1));

        System.out.println("Задайте произвольный массив. Выведете его элементы, начиная с конца");
        int[] array = new int[]{1, 2, 3, 4, 5};
        printArrayReversed(array);
    }

    //Задача 1: Задайте значения M и N. Вывести все натуральные числа в промежутке от M до N.
    public static void printNaturalNumbersInRange(int m, int n) { // 5, 10
        if (m <= n) {
            System.out.print(m + " ");
            printNaturalNumbersInRange(m + 1, n);
        }
    }

    //Задача 2: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }


    //Задача 3: Задайте произвольный массив. Выведете его элементы, начиная с конца. Использовать рекурсию.
    public static void printArrayReversed(int[] arr, int index) {
        if (index >= 0) {
            System.out.print(arr[index] + " ");
            printArrayReversed(arr, index - 1);
        }
    }

    public static void printArrayReversed(int[] arr) {
        printArrayReversed(arr, arr.length - 1);
    }

}

