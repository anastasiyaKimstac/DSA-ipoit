package by.it.group410972.kimstach.lesson08;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class Lesson08Test {
    @Test
    public void A() throws Exception {
        InputStream stream = A_Knapsack.class.getResourceAsStream("dataA.txt");
        A_Knapsack instance = new A_Knapsack();
        int res=instance.getMaxWeight(stream);
        assertEquals("A failed", 14, res);
    }

    @Test
    public void B() throws Exception {
        InputStream stream = B_Knapsack.class.getResourceAsStream("dataB.txt");
        B_Knapsack instance = new B_Knapsack();
        int res=instance.getMaxWeight(stream);
        assertEquals("B failed", 9, res);
    }

    @Test
    public void C() throws Exception {
        InputStream stream = C_Stairs.class.getResourceAsStream("dataC.txt");
        C_Stairs instance = new C_Stairs();
        int res=instance.getMaxSum(stream);
        assertEquals("C failed", 3, res);
    }

}
