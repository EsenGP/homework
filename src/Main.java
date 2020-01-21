import java.util.Scanner;

public class Main {
    public static void main(String args[]){
                                // Это ёлочки - 1 задание
        System.out.println("ЁЛАЧКИИИИИ УИИИИИИИ");
        System.out.println(
                "        /\\               /\\ \n" +
                "       /  \\             /  \\      \n" +
                "      / 1  \\           /  1 \\     \n" +
                "     / 0  1 \\         /  1   \\    \n" +
                "    /  0   1 \\       /    0   \\   \n" +
                "    ▔▔▔   ▔▔▔       ▔▔▔   ▔▔▔    \n" +
                "      / 1  \\           /    \\     \n" +
                "     /   0  \\         /1  0  \\    \n" +
                "    /  0 1   \\       / 0   1  \\   \n" +
                "   /   1 0 1  \\     /  1     0 \\  \n" +
                "   ▔▔▔▔   ▔▔▔▔     ▔▔▔▔   ▔▔▔▔   \n" +
                "       |  |             |  |       \n" +
                "       |  |             |  |       \n" +
                "       |  |             |  |       \n");
                            // Тута второе задания - индекс массы тела
        int m = 60;
        double h = 1.74;
        double I = m / (h * h);
            System.out.println("Индекс массы тела равен " + I);
                             //Доп задание - калькуляторщик ёпта
                 //Ввод чисел
        System.out.println("Введите первое, а затем и второе число:");
        Scanner scannum1 = new Scanner(System.in);
        Scanner scannum2 = new Scanner(System.in);
        int num1 = scannum1.nextInt();
        int num2 = scannum2.nextInt();
               //Результаты
        int summa = num1 + num2;
        int minus = num1 - num2;
        int result3 = num1 * num2;
        double result4 = (double) num1 / num2;


                //Вывод результатов
        System.out.println("Сумма: " + summa + "\nРазность: " + minus + "\nПроизведение: " + result3 + "\nЧастное: " + result4);

    }
}
