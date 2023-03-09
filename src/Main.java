public class Main {
    public static void main(String[] args) {

        int initialBalance = 500; // Начальный счёт.

        int replenishmentAmount = 900; // Сумма пополнения.

        int finalBalance = (initialBalance + replenishmentAmount);

        if (finalBalance > 1000) {

            int finalBalanceAndBonus = ((replenishmentAmount / 100) + finalBalance);

            System.out.println("Баланс счёта + бонус: " + finalBalanceAndBonus);

        } else {

            System.out.println("Баланс счёта: " + finalBalance);

        }
    }


}