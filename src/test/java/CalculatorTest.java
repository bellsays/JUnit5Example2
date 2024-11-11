import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();
    //สร้าง class เพื่อแยก case scenario ตามเงื่อนไขที่เราแยกไว้ในคลาส
    @Test
    public void testAddition() {
        // ทดสอบการบวก
        assertEquals(5, calculator.add(2, 3), "2 + 3 ควรเท่ากับ 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 ควรเท่ากับ -1");
        assertEquals(0, calculator.add(0, 0), "0 + 0 ควรเท่ากับ 0");
    }

    @Test
    public void testSubtraction() {
        // ทดสอบการลบ
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 ควรเท่ากับ 1");
        assertEquals(-3, calculator.subtract(-2, 1), "-2 - 1 ควรเท่ากับ -3");
        assertEquals(0, calculator.subtract(0, 0), "0 - 0 ควรเท่ากับ 0");
    }
}
