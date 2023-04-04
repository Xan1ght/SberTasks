import ok.java.collections.LinkedList;
import org.junit.Assert;

import static org.junit.Assert.*;

public class LinkedListTest {
    @org.junit.Test
    public void LinkedListTest() {
        LinkedList test1 = new LinkedList();
        test1.add(2);
        test1.add(5);
        test1.add(35);
        Assert.assertEquals(3, test1.size());
        Assert.assertEquals(5, test1.get(2));
        Assert.assertEquals(35, test1.get(3));
        Assert.assertEquals(2, test1.get(1));
    }
}