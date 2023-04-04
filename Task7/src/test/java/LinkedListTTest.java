import ok.java.collections.LinkedListT;
import org.junit.Assert;

import static org.junit.Assert.*;

public class LinkedListTTest {
    @org.junit.Test
    public void LinkedListTTest() {
        LinkedListT<Integer> test1 = new LinkedListT();
        test1.add(2);
        test1.add(5);
        test1.add(35);
        Integer I = test1.get(1);
        Integer J = test1.get(2);
        Integer K = test1.get(3);
        Assert.assertEquals(3, test1.size());
        Assert.assertEquals(J, test1.get(2));
        Assert.assertEquals(K, test1.get(3));
        Assert.assertEquals(I, test1.get(1));
    }
}