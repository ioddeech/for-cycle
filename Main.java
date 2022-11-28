import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int value = new Scanner(System.in).nextInt();

        String resultLine = "";

        System.out.println("Все пары положительных чисел, произведение которых будет равно " + value);

        //Цикл поиска пар числа.
        for (int i = 1; i <= value; i = i + 1) {
            for (int j = value; j <= value && j >= 1; j = j - 1) {
                if (value % i == 0 && i * j == value) {
                    System.out.println(i + " * " + j);
                }
            }
        }

    }
}
