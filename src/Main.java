public class Main {

    public static void main(String[] args) {

        int score = 300;
        int depositAccount = 2000;

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        } else {
            bonus = 0;
        }


        int balance = score + depositAccount + bonus;

        System.out.println(" Итоговый счет: " + balance + " рублей. ");
        System.out.println(" Ваш бонус: " + bonus + " рублей. ");
    }
}
