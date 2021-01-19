public class Main {
    public static void main(String[] args) {
        int accountBefore = 100;
        int amount = 1099;
        int bonus = amount > 1000 ? amount / 100 : 0;
        int accountAfter = accountBefore + amount + bonus;
        System.out.println(accountAfter);
    }
}
