public class Main {
    public static void main(String[] args) {

        int ticket_price = 13_676; // стоимость билета
        int bonus = 20; // за сколько потраченных рублей начислят бонус
        int bonus_ball = ticket_price / bonus; // итоговый расчет начисленных бонусов
        System.out.print(bonus_ball);
    }
}