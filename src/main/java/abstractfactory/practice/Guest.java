package abstractfactory.practice;

public abstract class Guest {
    private String name;
    protected String contact;
    protected String email;
    protected String snsId;
    
    Guest(String name, String contact, String email, String snsId) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.snsId = snsId;
    }

    abstract boolean validate();

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getSnsId() {
        return snsId;
    }
}