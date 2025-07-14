public class WhatsappNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("WHATSAPP Notification: Your new balance is: " + account.getBalance());
    }
}