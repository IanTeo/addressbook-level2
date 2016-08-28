package seedu.addressbook.data.person;

public class Street {
    
    public static final String EXAMPLE = "Clementi Ave 2";
    public static final String MESSAGE_BLOCK_CONTRAINTS = "Address street can be in any format";
    public static final String BLOCK_VALIDATION_REGEX = ".+";
    
    private String streetName;
    
    public Street(String street) {
        this.streetName = street;
    }
    
    public String getStreetName() {
        return streetName;
    }
    
    @Override
    public String toString() {
        return streetName;
    }

}
