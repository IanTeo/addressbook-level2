package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, #12-34, 654321";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in the format block"
                                + ", street, unit, postal code. Each seperated by a comma.";
    public static final String ADDRESS_VALIDATION_REGEX = "[\\w]+,[\\w]+,[\\w]+,[\\w]+";
    
    public static final int ADDRESS_DETAIL_COUNT = 4;
    public static final int ADDRESS_DETAIL_INDEX_BLOCK = 0;
    public static final int ADDRESS_DETAIL_INDEX_STREET = 1;
    public static final int ADDRESS_DETAIL_INDEX_UNIT = 2;
    public static final int ADDRESS_DETAIL_INDEX_POSTAL_CODE = 3;

    public final Block block;
    public final Street street;
    public final Unit unit;
    public final PostalCode postalCode;
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] details = address.split(",", ADDRESS_DETAIL_COUNT);
        this.block = new Block(details[ADDRESS_DETAIL_INDEX_BLOCK].trim());
        this.street = new Street(details[ADDRESS_DETAIL_INDEX_STREET].trim());
        this.unit =  new Unit(details[ADDRESS_DETAIL_INDEX_UNIT].trim());
        this.postalCode =  new PostalCode(details[ADDRESS_DETAIL_INDEX_POSTAL_CODE].trim());
        this.value = toString();
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        String value = this.block + ", " + this.street + ", " + this.unit + ", " + this.postalCode;
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}