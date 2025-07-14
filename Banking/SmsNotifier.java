public class SmsNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("SMS Notification: Your new balance is: " + account.getBalance());
    }
}