import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach // 테스트 전에 실행
    void init() {
        this.calculator = new Calculator();
    }

    @Test
    void test() {
        assertNotNull(this.calculator);
    }

    @Disabled
    @Test
    void add() {
        fail("Not yet implemented");
    }

    @Disabled
    @Test
    void subtract() {
        fail("Not yet implemented");
    }

    @Disabled
    @Test
    void multiply() {
        fail("Not yet implemented");
    }

    @Disabled
    @Test
    void divide() {
        fail("Not yet implemented");
    }
}