public class Main {
    public static void main(String[] args) {
        int deposit = 100;  // счёт клиента
        int putMany = 1100;   // пополнил счёт на сумму

        int percent;
        if (putMany >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = putMany * percent / 100;
        System.out.println(deposit + putMany + bonus);
    }
}
