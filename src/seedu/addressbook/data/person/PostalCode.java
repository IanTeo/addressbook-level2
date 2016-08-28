package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
    
    public static final String EXAMPLE = "654321";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "Address postal code must be 6 digits";
    public static final String POSTAL_CODE_VALIDATION_REGEX = "[\\d]{6}";
    
    private String postalCode;
    
    /**
     * Validates given address postal code.
     *
     * @throws IllegalValueException if given address postal code string is invalid.
     */
    public PostalCode(String postalCode) throws IllegalValueException {
        if (!isValidPostalCode(postalCode)) {
            throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
        }
        
        this.postalCode = postalCode;
    }
    
    /**
     * Returns true if a given string is a valid person address postal code.
     */
    public static boolean isValidPostalCode(String test) {
        return test.matches(POSTAL_CODE_VALIDATION_REGEX);
    }
    
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }
    
}
