package abstractfactory.practice;

public class QueueingGuest extends Guest {

    QueueingGuest(String name, String contact, String email, String snsId) {
        super(name, contact, email, snsId);
    }

    @Override
    public boolean validate() {
        if (this.contact == null){
            return false;
        }
        return true;
    }
}