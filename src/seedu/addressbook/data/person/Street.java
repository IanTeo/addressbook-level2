package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
    
    public static final String EXAMPLE = "Clementi Ave 2";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Address street can be in any format";
    public static final String STREET_VALIDATION_REGEX = ".+";
    
    private String streetName;
    
    /**
     * Validates given address street.
     *
     * @throws IllegalValueException if given address street string is invalid.
     */
    public Street(String street) throws IllegalValueException {
        if (!isValidStreet(street)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.streetName = street;
    }
    
    /**
     * Returns true if a given string is a valid person address street.
     */
    public static boolean isValidStreet(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }
    
    public String getStreetName() {
        return streetName;
    }
    
    @Override
    public String toString() {
        return streetName;
    }

}
