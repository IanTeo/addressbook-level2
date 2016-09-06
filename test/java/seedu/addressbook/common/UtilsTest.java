package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {    
    /**
     * Test null arguments for isAnyNull()
     */
    
    @Test
    public void isAnyNull_singleNullArgsShouldReturnTrue() {
        Object object = null;
        assertTrue("1 null args must return true", Utils.isAnyNull(object));
    }
    
    @Test
    public void isAnyNull_singleNullWithMultipleArgsShouldReturnTrue() {
        assertTrue("1 null args and 2 objects must return true", Utils.isAnyNull(new Object(), null, new Object()));
    }
    
    @Test
    public void isAnyNull_multipleNullArgsShouldReturnTrue() {
        assertTrue("3 null args must return true", Utils.isAnyNull(null, null, null));
    }
    
    /**
     * Test no null arguments for isAnyNull();
     */

    @Test
    public void isAnyNull_singleObjectArgsShouldReturnFalse() {
        assertFalse("1 object must return false", Utils.isAnyNull(new Object()));
    }
    
    @Test
    public void isAnyNull_multipleObjectArgsShouldReturnFalse() {
        assertFalse("3 objects must return false", Utils.isAnyNull(new Object(), new Object(), new Object()));
    }
    
    /**
     * Test unique collection for elementsAreUnique()
     */
    
    @Test
    public void elementsAreUnique_emptySetShouldReturnTrue() {
        ArrayList<String> set = new ArrayList<String>();
        assertTrue("empty set must return true", Utils.elementsAreUnique(set));
    }
    
    @Test
    public void elementsAreUnique_singleElementSetShouldReturnTrue() {
        ArrayList<String> set = new ArrayList<String>();
        set.add("Object");
        assertTrue("set with 1 element must return true", Utils.elementsAreUnique(set));
    }
    
    @Test
    public void elementsAreUnique_multipleUniqueElementSetShouldReturnTrue() {
        ArrayList<String> set = new ArrayList<String>();
        set.add("Object 1");
        set.add("Object 2");
        set.add("Object 3");
        assertTrue("set with multiple unique elements must return true", Utils.elementsAreUnique(set));
    }
    
    /**
     * Test non unique collection for elementsAreUnique()
     */
    
    @Test
    public void elementsAreUnique_multipleNonUniqueElementSetShouldReturnFalse() {
        ArrayList<String> set = new ArrayList<String>();
        set.add("Object 1");
        set.add("Object 1");
        set.add("Object 2");
        assertFalse("set with 2 same elements must return false", Utils.elementsAreUnique(set));
    }
    
    @Test
    public void elementsAreUnique_allSameElementSetShouldReturnFalse() {
        ArrayList<String> set = new ArrayList<String>();
        set.add("Object 1");
        set.add("Object 1");
        set.add("Object 1");
        assertFalse("set with all same elements must return false", Utils.elementsAreUnique(set));
    }
}

