public class EmailNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("EMAIL Notification: Your new balance is: " + account.getBalance());
    }
}