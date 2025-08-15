public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13_676; // стоимость билета
        int bonus = 20; // за сколько потраченных рублей начислят бонус
        int bonusBall = ticketPrice / bonus; // итоговый расчет начисленных бонусов
        System.out.print(bonusBall);
    }
}
