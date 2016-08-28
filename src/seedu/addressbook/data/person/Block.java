package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
    
    public static final String EXAMPLE = "311a";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = "Address block must be numbers followed by "
                        + "a single alphabet (if applicable)";
    public static final String BLOCK_VALIDATION_REGEX = "[\\d]+[\\w]$?";
    
    private String blockNum;
    
    /**
     * Validates given address block.
     *
     * @throws IllegalValueException if given address block string is invalid.
     */
    public Block(String block) throws IllegalValueException {
        if (!isValidBlock(block)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.blockNum = block;
    }
    
    /**
     * Returns true if a given string is a valid person address block.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }
    
    public String getBlockNum() {
        return blockNum;
    }
    
    @Override
    public String toString() {
        return blockNum;
    }
    
}
