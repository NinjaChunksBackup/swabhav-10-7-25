public class BankApp {
    public static void main(String[] args) {

        Account priyaAccount = new Account(1, "Priya", 2500.0);
        Account rahulAccount = new Account(2, "Rahul", 500.0);

        INotifier email = new EmailNotifier();
        INotifier sms = new SmsNotifier();

        priyaAccount.registerNotifier(email);
        priyaAccount.registerNotifier(sms);
        rahulAccount.registerNotifier(sms);

        priyaAccount.deposit(500.0);
        
        try {
            priyaAccount.withdraw(200.0);
        } catch (ExceptionTest e) {
            System.out.println(e.getMessage());
        }

        try {
            rahulAccount.withdraw(600.0);
        } catch (ExceptionTest e) {
            System.out.println("\n" + e.getMessage());
        }
        
        System.out.println(priyaAccount);
        System.out.println(rahulAccount);
    }
}