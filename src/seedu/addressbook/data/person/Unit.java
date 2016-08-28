package seedu.addressbook.data.person;

public class Unit {
    
    public static final String EXAMPLE = "#02-25";
    public static final String MESSAGE_BLOCK_CONTRAINTS = "Address unit must be in the format #number-number";
    public static final String BLOCK_VALIDATION_REGEX = "#[\\d]+-[\\d]+";
    
    private String unitNumber;
    
    public Unit(String unit) {
        this.unitNumber = unit;
    }
    
    public String getUnitNumber() {
        return unitNumber;
    }
    
    @Override
    public String toString() {
        return unitNumber;
    }

}
