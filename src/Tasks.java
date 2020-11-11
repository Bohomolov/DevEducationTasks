import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

    }
}
//Тема: Базовые задания


//Условные операторы

//1.	Если, а – четное посчитать а*б, иначе а+б
class IfElse1 {
    static int a, b, c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        a = scanner.nextInt();
        System.out.println("Enter b value: ");
        b = scanner.nextInt();
        if (a % 2 == 0) {
            c = a * b;
        } else {
            c = a + b;
        }
        System.out.println("C - equal: " + c);
    }
}

//2.	Определить какой четверти принадлежит точка с координатами (х,у)

//3.	Найти суммы только положительных из трех чисел
class IfElse3 {
    static int a, b, c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        a = scanner.nextInt();
        System.out.println("Enter b value: ");
        b = scanner.nextInt();
        System.out.println("Enter c value: ");
        c = scanner.nextInt();
        int d;
        if (a > 0 && b > 0 && c > 0) {
            d = a + b + c;
            System.out.println(d);
        } else if (a > 0 && b > 0) {
            d = a + b;
            System.out.println(d);
        } else if (c > 0 && b > 0) {
            d = c + b;
            System.out.println(d);
        } else if (c > 0 && a > 0) {
            d = c + a;
            System.out.println(d);
        } else if (a > 0) {
            d = a;
            System.out.println(d);
        } else if (b > 0) {
            d = b;
            System.out.println(d);
        } else if (c > 0) {
            d = c;
            System.out.println(d);
        } else {
            System.out.println("You enter incorrect value! ");
        }

    }
}

//4.	Посчитать выражение (макс (а*б*с, а+б+с))+3
class IfElse4 {
    static int a, b, c, d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        a = scanner.nextInt();
        System.out.println("Enter b value: ");
        b = scanner.nextInt();
        System.out.println("Enter c value: ");
        c = scanner.nextInt();
        d = Math.max(a * b * c, a + b + c) + 3;
        System.out.println(d);
    }
}

//5.	Написать программу определения оценки студента по его рейтингу, на основе следующих правил
/*Рейтинг 	Оценка
0-19	F
20-39	E
40-59	D
60-74	C
75-89	B
90-100	A*/
class IfElse5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student rating: ");
        int rating = in.nextInt();
        if (rating >= 0 && rating <= 19) {
            System.out.println("Student rating: F");
        } else if (rating >= 20 && rating <= 39) {
            System.out.println("Student rating: E");
        } else if (rating >= 40 && rating <= 59) {
            System.out.println("Student rating: D");
        } else if (rating >= 60 && rating <= 74) {
            System.out.println("Student rating: C");
        } else if (rating >= 75 && rating <= 89) {
            System.out.println("Student rating: B");
        } else if (rating >= 90 && rating <= 100) {
            System.out.println("Student rating: A");
        }
    }
}
//Циклы

//1.	Найти сумму четных чисел и их количество в диапазоне от 1 до 99
class LoopTask1 {
    public static void main(String[] args) {
        int outSum = 0;
        int outQuantity = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                outSum += i;
                outQuantity += 1;
            }
        }
        System.out.println("Quantity of even numbers " + outQuantity);
        System.out.println("Sum even numbers: " + outSum);
    }
}

//2.	Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
//3.	Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)

//4.	Вычислить факториал числа n. n! = 1*2*…*n-1*n;
class LoopTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        System.out.println(result);
    }
}

//5.	Посчитать сумму цифр заданного числа
class LoopTask5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter digits: ");
        int digits = scanner.nextInt();

        int a, b, c, d, e;

        a = digits % 10;
        b = ((digits - a) % 100) / 10;
        c = (((digits - a) - b) % 1000) / 100;
        d = ((((digits - a) - b) - c) % 10000) / 1000;
        e = a + b + c + d;
        System.out.println(e);//это я как вариант накидал
    }

}

//6.	Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.


//Одномерные массивы
//1.	Найти минимальный элемент массива
class ArrayTask1 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};

    public static void main(String[] args) {

        System.out.println(Arrays.stream(array).min());
        minElement(array);
    }

    public static void minElement(int[] array) {
        Arrays.sort(array);
        int min = array[0];
        System.out.println("Minimum element of array: " + min);
    }

}

//2.	Найти максимальный элемент массива
class ArrayTask2 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};

    public static void main(String[] args) {
        System.out.println(Arrays.stream(array).max());
        maxElement(array);
    }

    public static void maxElement(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        System.out.println("Maximum element of array: " + max);
    }
}

//3.	Найти индекс минимального элемента массива
class ArrayTask3 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};

    public static void main(String[] args) {

        indexOfMin(array);
    }

    public static void indexOfMin(int[] array) {

        int out = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[out]) {
                out = i;
            }
        }
        System.out.println("Index of min element: " + out);
    }
}

//4.	Найти индекс максимального элемента массива
class ArrayTask4 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};

    public static void main(String[] args) {

        indexOfMax(array);
    }

    public static void indexOfMax(int[] array) {

        int out = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[out]) {
                out = i;
            }
        }
        System.out.println("Index of maximum element: " + out);
    }
}

//5.	Посчитать сумму элементов массива с нечетными индексами
class ArrayTask5 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};
    static int sum = 0;

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum array elements with odd index: " + sum);
    }
}

//6.	Сделать реверс массива (массив в обратном направлении)
class ArrayTask6 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};
    static int[] arrayR = new int[array.length];

    public static void main(String[] args) {

        reverse(array);
    }

    static int back = array.length - 1;

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            arrayR[i] = array[back];
            System.out.print(arrayR[i] + " ");
            back--;
        }

    }
}

//7.	Посчитать количество нечетных элементов массива
class ArrayTask7 {
    static int[] array = {1, 2, 34, 56, 7, 84, 2, 3, 5, 7, 9, 98, 64, 3, 45, 0};
    static int sum = 0;

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        System.out.println("Quantity array elements with odd index: " + sum);
    }
}
//8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
//9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
//10.	Отсортировать массив (Quick, Merge, Shell, Heap)

//Функции

//1.	Вводим число(0-999), получаем строку с прописью числа.
class Task1 {
    public static String[] eng20 = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
            "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    public static String[] eng100 = {"", "", "Twenty ", "Thirty ", "Fourty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    public static String[] eng1000 = {"", "One hundred ", "Two hundred ", "Three hundred ", "Four hundred ", "Five hundred ", "Six hundred ", "Seven hundred ",
            "Eight hundred ", "Nine hundred ",};

    public static void main(String[] args) {

        int[] arabicOut = new int[100];

        String[] engOut = new String[100];

        Scanner inNumbers = new Scanner(System.in);

        System.out.println("Enter arabic numbers: ");

        int arabic = inNumbers.nextInt();

        if (arabic % 10 < 20 && arabic != 0) {
            arabicOut[0] = arabic % 10;
        }
        if (arabic % 100 < 100 && arabic % 100 != 0) {
            arabic -= arabic % 10;
            arabicOut[1] = arabic % 100;
        }
        if (arabic % 1000 < 1000 && arabic % 1000 != 0) {
            arabicOut[2] = arabic % 1000;
        }

        engOut[0] = eng20[arabicOut[0]];
        engOut[1] = eng100[arabicOut[1] / 10];
        engOut[2] = eng1000[arabicOut[2] / 100];

        for (int i = 3; i >= 0; i--) {
            if (engOut[i] != null)
                System.out.print(engOut[i]);
        }
        inNumbers.close();
    }
}

//2.	Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число
//3.	Для задания 2 расширить диапазон до 999 миллиардов
//4.	Для задания 3 расширить диапазон до 999 миллиардов

