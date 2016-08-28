package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
    
    public static final String EXAMPLE = "#02-25";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Address unit must be in the format #number-number";
    public static final String UNIT_VALIDATION_REGEX = "#[\\d]+-[\\d]+";
    
    private String unitNumber;
    
    /**
     * Validates given address unit.
     *
     * @throws IllegalValueException if given address unit string is invalid.
     */
    public Unit(String unit) throws IllegalValueException {
        if (!isValidUnit(unit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.unitNumber = unit;
    }
    
    /**
     * Returns true if a given string is a valid person address unit.
     */
    public static boolean isValidUnit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }
    
    public String getUnitNumber() {
        return unitNumber;
    }
    
    @Override
    public String toString() {
        return unitNumber;
    }

}
