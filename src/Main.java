public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {1053, 1394, 1254, 1139, 1472};
        int sum = 0;
        for (int index : payments) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача 2");
        int[] week = {10874, 18490, 14028, 15274, 12038};
        int maxPayments = -1;
        int minPayments = 19000;
        for (final int i : week) {
            if (i > maxPayments) {
                maxPayments = i;
            }
        }
        for (final int j : week) {
            if (j < minPayments) {
                minPayments = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "
                + minPayments + " рублей." +
                " Максимальная сумма трат за неделю составила "
                + maxPayments + " рублей");
        System.out.println("Задача 3");
        int[] week3 = {10874, 18490, 14028, 15274, 12038};
        double sum3 = 0d;
        for (int index : week3) {
            sum3 += index / 5;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum3 + " рублей");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}