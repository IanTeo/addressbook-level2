package seedu.addressbook.data.person;

public class Unit {
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
