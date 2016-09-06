package seedu.addressbook.data.person;

public abstract class Contact {
    public String value;
    protected boolean isPrivate;
    
    protected Contact() { }
    
    public Contact(String value, boolean isPrivate) {
        this.isPrivate = isPrivate;
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    public abstract boolean equals(Object other);

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
