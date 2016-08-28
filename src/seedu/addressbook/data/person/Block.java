package seedu.addressbook.data.person;

public class Block {
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
