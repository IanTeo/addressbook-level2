package seedu.addressbook.data.person;

public class PostalCode {
    
    public static final String EXAMPLE = "654321";
    public static final String MESSAGE_BLOCK_CONTRAINTS = "Address postal code must be 6 digits";
    public static final String BLOCK_VALIDATION_REGEX = "[\\d]{6}";
    
    private String postalCode;
    
    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }
    
}
