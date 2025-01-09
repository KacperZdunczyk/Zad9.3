public class Main {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 1000, "123456789");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}
