package abstractfactory.practice;

public class ReserveGuest extends Guest {

    ReserveGuest(String name, String contact, String email, String snsId) {
        super(name, contact, email, snsId);
    }

    @Override
    public boolean validate() {
        if (
            (this.contact != null) ||
            (this.email != null) ||
            (this.snsId != null)
        ){
            return false;
        }
        return true;
    }
}