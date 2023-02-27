public class Main {
    public static void main(String[] args) {

        int a = 500; // Начальный счёт.

        int b = 900; // Сумма пополнения.

        int c = (a + b);

        if (c > 1000) {

            int d = ((b / 100) + c);

            System.out.println("Баланс счёта + бонус: " + d);

        } else {

            System.out.println("Баланс счёта: " + c);

        }
    }


}