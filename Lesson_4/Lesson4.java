
public class Lesson4 {
    
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumInRange(6, 8);
        printPositiveOrNegative(-13);
        isNegative(5);
        printStringMultipleNumber("I need a job", 4);
        isLeapYear(2024);
        
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipTheNumbers(array);
        
        int[] hundredArray = new int[100];
        fillArrayWithValues(hundredArray);
        
        int[] fillArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyByTwoIfLessThanSix(fillArray);
        
        createSquareMatrix(4);
        createArray(5, 10); 
    }

//Задание №1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    
//Задание №2    
    public static void checkSumSign() {
        int a = 14;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

//Задание №3
    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {                 // else System.out.println("Зелёный"); если условие приписывать неявно
            System.out.println("Зелёный");
        }    
    }

//Задание №4
    public static void compareNumbers() {
        int a = 44;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

//Задание №5
    public static boolean checkSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        boolean result = sum >= 10 && sum <= 20;
        System.out.println(result);
        return result;
    }
    
//Задание №6
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

//Задание №7
    public static boolean isNegative(int number) {
        boolean result = number < 0;
        System.out.println(result);
        return result;
    }      


//Задание №8
    public static void  printStringMultipleNumber(String str, int  number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

//Задание №9
    public static boolean isLeapYear(int year) {
        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(result);
        return result;
    }

//Задание №10
    public static void flipTheNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.print("Массив после замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

//Задание №11
    public static void fillArrayWithValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println();
        System.out.println("Массив после заполнения: ");
        for (int i : array) {
        System.out.print(i + " ");
    }
    System.out.println();
    }

//Задание №12
    public static void multiplyByTwoIfLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
            array[i] *= 2;
            }
        }
        System.out.println("Массив после умножения: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

//Задание №13
    public static void createSquareMatrix(int n) {
        int[][] array = new int[n][n]; 
        System.out.println("Диагональ заполнена: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i][j] = 1; 
                }
                System.out.print(array[i][j] + " "); 
            }
            System.out.println();
        }
    }

//Задание №14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        System.out.println("Массив создан: "); 
        for (int i = 0; i < len; i++) {
            array[i] = initialValue; 
            System.out.print(array[i] + " "); 
        }
        return array; 
    }
}
