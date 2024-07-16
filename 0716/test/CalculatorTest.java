import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach // 테스트 전에 실행
    void init() {
        this.calculator = new Calculator();
    }

    @Disabled
    @Test
    void test() {
        assertNotNull(this.calculator);
    }

    @Test
    void add() {
//        assertEquals(8, this.calculator.add(3, 5));
        assertThat(this.calculator.add(3, 5)).isEqualTo(8);
    }

    @Test
    void subtract() {
        assertEquals(5, this.calculator.subtract(8, 3));
    }

    @Test
    void multiply() {
        assertEquals(24, this.calculator.multiply(6, 4));
    }

    @Test
    void divide() {
        assertEquals(3, this.calculator.divide(24, 6) );
    }
}