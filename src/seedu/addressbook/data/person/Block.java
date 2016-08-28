package seedu.addressbook.data.person;

public class Block {
    
    public static final String EXAMPLE = "311a";
    public static final String MESSAGE_BLOCK_CONTRAINTS = "Address block must be numbers followed by "
                        + "an alphabet (if applicable)";
    public static final String BLOCK_VALIDATION_REGEX = "[\\d]+[\\w]$?";
    
    private String blockNum;
    
    public Block(String block) {
        this.blockNum = block;
    }
    
    public String getBlockNum() {
        return blockNum;
    }
    
    @Override
    public String toString() {
        return blockNum;
    }
    
}
