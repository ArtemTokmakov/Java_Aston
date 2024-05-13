package Lesson_8;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
            {"1", "2", "3", "4"}, 
            {"5", "6", "7", "8"}, 
            {"9", "10", "11", "12"}, 
            {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArrayElements(array);
            System.out.println("Сумма всех элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}